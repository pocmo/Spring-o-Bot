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

/**
 * Base class for sensor packets.
 * 
 * @author Sebastian Kaspari <s.kaspari@gmail.com>
 */
public class Packet
{
    private int packetId;
    private int[] data;
    
    /**
     * Create a new sensor packet.
     * 
     * @param packetId Sensor packet id.
     * @param data     Optional sensor data.
     */
    public Packet(int packetId, int... data)
    {
        this.packetId = packetId;
        this.data     = data;
    }
    
    /**
     * Get the id of the packet.
     * 
     * See constants in the Sensor class.
     * 
     * @return The id of the packet.
     */
    public int getId()
    {
        return packetId;
    }
    
    /**
     * Get all data bytes.
     * 
     * @return Array of all data bytes.
     */
    public int[] getData()
    {
        return data;
    }
}
