/*
   Copyright 2011 Sebastian Kaspari

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */
package de.pocmo.springobot.sensors;

import java.io.IOException;
import java.io.InputStream;


/**
 * RobotReader class for read sensor packets from the Open Interface.
 *
 * @author Sebastian Kaspari <s.kaspari@gmail.com>
 */
public class RobotReader
{
    /**
     * The input stream to read from.
     */
    private InputStream stream;

    /**
     * Create a new RobotReader instance
     *
     * @param stream The input stream to read from.
     */
    public RobotReader(InputStream stream)
    {
        this.stream = stream;
    }

    /**
     * Read a sensor packet from the robot.
     *
     * @return The packet or null if no packet could be read.
     */
    public Packet readPacket()
    {
        try {
            int packetId = stream.read();

            int numberOfDataBytes = Sensor.getDataBytesByPacketId(packetId);
            int[] dataBuffer = new int[numberOfDataBytes];

            for (int i = 0; i < numberOfDataBytes; i++) {
                dataBuffer[i] = stream.read();
            }

            return new Packet(packetId, dataBuffer);
        }
        catch (IOException e) {
            return null;
        }
    }
}
