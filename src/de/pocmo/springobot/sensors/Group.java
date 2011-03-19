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
 * Constants for the ids of sensor packet groups.
 *
 * @author Sebastian Kaspari <s.kaspari@gmail.com>
 */
public class Group
{
    /**
     * Packets 7-26: 26 Bytes
     */
    public static final int PACKETS_7_26  = 0;

    /**
     * Packets 7-16: 10 Bytes
     */
    public static final int PACKETS_7_16  = 1;

    /**
     * Packets 17-20: 6 Bytes
     */
    public static final int PACKETS_17_20 = 2;

    /**
     * Packets 21-26: 10 Bytes
     */
    public static final int PACKETS_21_26 = 3;

    /**
     * Packets 27-34: 14 Bytes
     */
    public static final int PACKETS_27_34 = 4;

    /**
     * Packets 35-42: 12 Bytes
     */
    public static final int PACKETS_35_42 = 5;

    /**
     * Packets 7-42: 52 Bytes
     */
    public static final int PACKETS_7_42  = 6;
}
