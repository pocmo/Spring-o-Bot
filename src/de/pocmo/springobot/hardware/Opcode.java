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
package de.pocmo.springobot.hardware;

/**
 * Opcodes as defined by the Open Interface specification.
 * 
 * @author Sebastian Kaspari <s.kaspari@googlemail.com>
 */
public class Opcode
{
    /**
     * This command starts the OI (Open Interface).
     * 
     * Data Bytes: 0
     */
    public static int START = 128;
    
    /**
     * This command sets the baud rate in bits per second (bps)
     * at which OI commands and data are sent according to the
     * baud code sent in the data byte
     * 
     * Data Bytes: 1
     */
    public static int BAUD = 129;
    
    /**
     * This command puts the OI into Safe mode, enabling user
     * control of Create. It turns off all LEDs. The OI can be in
     * Passive, Safe, or Full mode to accept this command.
     * 
     * Data Bytes: 0
     */
    public static int SAFE = 131;
    
    /**
     * This command gives you complete control over Create
     * by putting the OI into Full mode, and turning off the cliff,
     * wheel-drop and internal charger safety features.
     *  
     * Data Bytes: 0
     */
    public static int FULL = 132;
    
    /**
     * This command starts the Spot Cover demo.
     * 
     * Create covers an area around its
     * starting position by spiraling outward,
     * then inward.
     * 
     * Data Bytes: 0
     */
    public static int SPOT = 134;
    
    /**
     * This command starts the Cover demo.
     * 
     * Create attempts to cover an entire
     * room using a combination of behaviors,
     * such as random bounce, wall following,
     * and spiraling.
     * 
     * Data Bytes: 0
     */
    public static int COVER = 135;
    
    /**
     * This command starts the requested built-in demo.
     * 
     * Data Bytes: 1
     */
    public static int DEMO = 136;
    
    /**
     * This command controls Create’s drive wheels.
     * 
     * Data Bytes: 4
     */
    public static int DRIVE = 137;
    
    /**
     * This command lets you control the three low side drivers.
     * 
     * Data Bytes: 3
     */
    public static int LOW_SIDE_DRIVERS = 138;
    
    /**
     * This command controls the LEDs on Create.
     * 
     * Data Bytes: 3
     */
    public static int LED = 139;
    
    /**
     * This command lets you specify up to sixteen songs to the OI
     * that you can play at a later time.
     * 
     * Data Bytes: 2N+2 (Where N is the number of notes in the song)
     */
    public static int SONG = 140;
    
    /**
     * This command lets you select a song to play from the songs
     * added to iRobot Create using the Song command.
     * 
     * Data Bytes: 1
     */
    public static int PLAY_SONG = 141;
    
    /**
     * This command requests the OI to send a packet of sensor
     * data bytes.
     * 
     * Data Bytes: 1
     */
    public static int SENSORS = 142;
    
    /**
     * This command starts the Cover and Dock demo.
     * 
     * Identical to the Cover demo, with one
     * exception. If Create sees an infrared
     * signal from an iRobot Home Base, it
     * uses that signal to dock with the Home
     * Base and recharge itself.
     * 
     * Data Bytes: 0
     */
    public static int COVER_AND_DOCK = 143;
    
    /**
     * This command lets you control the three low side drivers
     * with variable power.
     * 
     * Data Bytes: 3
     */
    public static int PWM_LOW_SIDE_DRIVERS = 144;
    
    /**
     * This command lets you control the forward and backward
     * motion of Create’s drive wheels independently.
     * 
     * Data Bytes: 4
     */
    public static int DRIVE_DIRECT = 145;
   
    /**
     * This command controls the state of the 3 digital output
     * pins on the 25 pin Cargo Bay Connector.
     * 
     * Data Bytes: 1
     */
    public static int DIGITAL_OUTPUTS = 147;
    
    /**
     * This command starts a continuous stream of data packets.
     * The list of packets requested is sent every 15 ms, which is
     * the rate iRobot Create uses to update data.
     * 
     * Data Bytes: N+1
     */
    public static int STREAM = 148;
    
    /**
     * This command lets you ask for a list of sensor packets.
     * 
     * Data Bytes: N+1 (Where N is the number of packets requested)
     */
    public static int QUERY_LIST = 149;
    
    /**
     * This command lets you stop and restart the steam without
     * clearing the list of requested packets.
     * 
     * Data Bytes: 1
     */
    public static int PAUSE_RESUME_STREAM = 150;
    
    /**
     * This command sends the requested byte out of low side
     * driver 1 (pin 23 on the Cargo Bay Connector), using the
     * format expected by iRobot Create’s IR receiver.
     * 
     * Data Bytes: 1
     */
    public static int SEND_IR = 151;
    
    /**
     * This command specifies a script to be played later. A script
     * consists of OI commands and can be up to 100 bytes long.
     * 
     * Data Bytes: N+1
     */
    public static int SCRIPT = 152;
    
    /**
     * This command loads a previously defined OI script into the
     * serial input queue for playback.
     * 
     * Data Bytes: 0
     */
    public static int PLAY_SCRIPT = 153;
    
    /**
     * This command returns the values of a previously stored
     * script, starting with the number of bytes in the script and
     * followed by the script’s commands and data bytes.
     * 
     * Data Bytes: 0
     */
    public static int SHOW_SCRIPT = 154;
    
    /**
     * This command causes Create to wait for the specified time.
     * During this time, Create’s state does not change, nor does
     * it react to any inputs, serial or otherwise.
     * 
     * Data Bytes: 1
     */
    public static int WAIT_TIME = 155;
    
    /**
     * This command causes iRobot Create to wait until it has
     * traveled the specified distance in mm.
     * 
     * Data Bytes: 2
     */
    public static int WAIT_DISTANCE = 156;
    
    /**
     * This command causes Create to wait until it has rotated
     * through specified angle in degrees.
     * 
     * Data Bytes: 2
     */
    public static int WAIT_ANGLE = 157;
    
    /**
     * This command causes Create to wait until it detects the
     * specified event.
     * 
     * Data Bytes: 1 (Signed)
     */
    public static int WAIT_EVENT = 158;
}
