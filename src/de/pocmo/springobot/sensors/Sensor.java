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
 * Constants for the sensor packet ids.
 *
 * @author Sebastian Kaspari <s.kaspari@gmail.com>
 */
public class Sensor
{
    /**
     * The state of the bumper and wheel drop sensors
     * are sent as individual bits.
     *
     * Data Bytes: 1
     */
    public static final int BUMPS_AND_WHEEL_DROPS = 7;

    /**
     * The state of the wall sensor is sent as a 1 bit value.
     *
     * Data Bytes: 1
     */
    public static final int WALL = 8;

    /**
     * The state of the cliff sensor on the left side of Create is
     * sent as a 1 bit value.
     *
     * Data Bytes: 1
     */
    public static final int CLIFF_LEFT = 9;

    /**
     * The state of the cliff sensor on the front left of Create is
     * sent as a 1 bit value.
     *
     * Data Bytes: 1
     */
    public static final int CLIFF_FRONT_LEFT = 10;

    /**
     * The state of the cliff sensor on the front right of Create is
     * sent as a 1 bit value.
     *
     * Data Bytes: 1
     */
    public static final int CLIFF_FRONT_RIGHT = 11;

    /**
     * The state of the cliff sensor on the right side of Create is
     * sent as a 1 bit value.
     *
     * Data Bytes: 1
     */
    public static final int CLIFF_RIGHT = 12;

    /**
     * The state of the virtual wall detector is sent as a 1 bit value.
     *
     * Note that the force field on top of the Home Base also trips
     * this sensor.
     *
     * Data Bytes: 1
     */
    public static final int VIRTUAL_WALL = 13;

    /**
     * The state of the three Low Side driver and two wheel
     * overcurrent sensors are sent as individual bits.
     *
     * Data Bytes: 1
     */
    public static final int LOW_SLIDE_DRIVER_AND_WHEEL_OVERCURRENTS = 14;

    // IDs 15-16 are unused
    // Unused bytes: Two unused bytes are sent after the overcurrent
    // byte when the requested packet is 0, 1, or 6. The value of the
    // two unused bytes is always 0.

    /**
     * This value identifies the IR byte currently being received
     * by iRobot Create.
     *
     * These bytes include those sent by the Roomba Remote,
     * the Home Base, Create robots using the Send IR command,
     * and user-created devices.
     *
     * Data Bytes: 1
     */
    public static final int INFRARED = 17;

    /**
     * The state of Create’s Play and Advance buttons are sent as
     * individual bits.
     *
     * Data Bytes: 1
     */
    public static final int BUTTONS = 18;

    /**
     * The distance that Create has traveled in millimeters since the
     * distance it was last requested is sent.
     *
     * Positive values indicate travel in the forward direction;
     * negative values indicate travel in the reverse direction.
     *
     * If the value is not polled frequently enough, it is capped
     * at its minimum or maximum.
     *
     * Data Bytes: 2
     */
    public static final int DISTANCE = 19;

    /**
     * The angle in degrees that iRobot Create has turned since the
     * angle was last requested is sent.
     *
     * Counter-clockwise angles are positive and clockwise
     * angles are negative. If the value is not polled frequently
     * enough, it is capped at its minimum or maximum.
     *
     * NOTE: Create uses wheel encoders to measure distance
     * and angle. If the wheels slip, the actual distance or angle
     * traveled may differ from Create’s measurements.
     *
     * Data Bytes: 2
     */
    public static final int ANGLE = 20;

    /**
     * This code indicates Create’s current charging state.
     *
     * Data Bytes: 1
     */
    public static final int CHARGING_STATE = 21;

    /**
     * This code indicates the voltage of Create’s batter y in
     * millivolts (mV).
     *
     * Data Bytes: 2
     */
    public static final int VOLTAGE = 22;

    /**
     * The current in milliamps (mA) flowing into or out of Create’s
     * battery.
     *
     * Negative currents indicate that the current is flowing
     * out of the battery, as during normal running. Positive currents
     * indicate that the current is flowing into the battery, as during
     * charging.
     *
     * Data Bytes: 2
     */
    public static final int CURRENT = 23;

    /**
     * The temperature of Create’s battery in degrees Celsius.
     *
     * Data Bytes: 1
     */
    public static final int BATTERY_TEMPERATURE = 24;

    /**
     * The current charge of Create’s battery in milliamp-hours (mAh).
     *
     * The charge value decreases as the battery is depleted
     * during running and increases when the battery is charged.
     *
     * Note that this value will not be accurate if you are using the
     * alkaline battery pack.
     *
     * Data Bytes: 2
     */
    public static final int BATTERY_CHARGE = 25;

    /**
     * The estimated charge capacity of Create’s battery in milliamphours
     * (mAh).
     *
     * Note that this value is inaccurate if you are using
     * the alkaline battery pack.
     *
     * Data Bytes: 2
     */
    public static final int BATTERY_CAPACITY = 26;

    /**
     * The strength of the wall sensor’s signal is returned.
     *
     * Data Bytes: 2
     */
    public static final int WALL_SIGNAL = 27;

    /**
     * The strength of the left cliff sensor’s signal is returned.
     *
     * Data Bytes: 2
     */
    public static final int CLIFF_LEFT_SIGNAL = 28;

    /**
     * The strength of the front left cliff sensor’s signal is returned.
     *
     * Data Bytes: 2
     */
    public static final int CLIFF_FRONT_LEFT_SIGNAL = 29;

    /**
     * The strength of the front right cliff sensor’s signal is returned.
     *
     * Data Bytes: 2
     */
    public static final int CLIFF_FRONT_RIGHT_SIGNAL = 30;

    /**
     * The strength of the right cliff sensor’s signal is returned.
     *
     * Data Bytes: 2
     */
    public static final int CLIFF_RIGHT_SIGNAL = 31;

    /**
     * The state of the digital inputs on the 25-pin Cargo Bay Connector
     * are sent.
     *
     * Data Bytes: 1
     */
    public static final int CARGO_BAY_DIGITAL_INPUTS = 32;

    /**
     * The 10-bit value of the analog input on the 25-pin Cargo Bay
     * Connector is returned.
     *
     * Data Bytes: 1
     */
    public static final int CARGO_BAY_ANALOG_SIGNAL = 33;

    /**
     * iRobot Create’s connection to the Home Base and Internal
     * Charger are returned.
     *
     * Data Bytes: 1
     */
    public static final int CHARGING_SOURCES_AVAILABLE = 34;

    /**
     * Current Open Interface Mode of the iRobot Create is returned.
     *
     * Data Bytes: 1
     */
    public static final int OI_MODE = 35;

    /**
     * The currently selected OI song is returned.
     *
     * Data Bytes: 1
     */
    public static final int SONG_NUMBER = 36;

    /**
     * The state of the OI song player.
     *
     * Data Bytes: 1
     */
    public static final int SONG_PLAYING = 37;

    /**
     * The number of data stream packets is returned.
     *
     * Data Bytes: 1
     */
    public static final int NUMBER_OF_STREAM_PACKETS = 38;

    /**
     * The velocity most recently requested with a Drive command
     * is returned.
     *
     * Range: -500 - 500 mm/s
     *
     * Data Bytes: 2
     */
    public static final int REQUESTED_VELOCITY = 39;

    /**
     * The radius most recently requested with a Drive command
     * is returned.
     *
     * Range: -32768 - 32767 mm
     *
     * Data Bytes: 2
     */
    public static final int REQUESTED_RADIUS = 40;

    /**
     * The right wheel velocity most recently requested with a Drive
     * Direct command is returned.
     *
     * Range: -500 - 500 mm/s
     *
     * Data Bytes: 2
     */
    public static final int REQUESTED_RIGHT_VELOCITY = 41;

    /**
     * The left wheel velocity most recently requested with a Drive
     * Direct command is returned.
     *
     * Range: -500 - 500 mm/s
     *
     * Data Bytes: 2
     */
    public static final int REQUESTED_LEFT_VELOCITY = 42;

    /**
     * Get number of data bytes for the given packet id.
     *
     * @param packetId
     * @return
     */
    public static int getDataBytesByPacketId(int packetId)
    {
        switch (packetId) {
            case BUMPS_AND_WHEEL_DROPS:
                return 1;
            case WALL:
                return 1;
            case CLIFF_LEFT:
                return 1;
            case CLIFF_FRONT_LEFT:
                return 1;
            case CLIFF_FRONT_RIGHT:
                return 1;
            case CLIFF_RIGHT:
                return 1;
            case VIRTUAL_WALL:
                return 1;
            case LOW_SLIDE_DRIVER_AND_WHEEL_OVERCURRENTS:
                return 1;
            case INFRARED:
                return 1;
            case BUTTONS:
                return 1;
            case DISTANCE:
                return 2;
            case ANGLE:
                return 2;
            case CHARGING_STATE:
                return 1;
            case VOLTAGE:
                return 2;
            case CURRENT:
                return 2;
            case BATTERY_TEMPERATURE:
                return 1;
            case BATTERY_CHARGE:
                return 2;
            case BATTERY_CAPACITY:
                return 2;
            case WALL_SIGNAL:
                return 2;
            case CLIFF_LEFT_SIGNAL:
                return 2;
            case CLIFF_FRONT_LEFT_SIGNAL:
                return 2;
            case CLIFF_FRONT_RIGHT_SIGNAL:
                return 2;
            case CLIFF_RIGHT_SIGNAL:
                return 2;
            case CARGO_BAY_DIGITAL_INPUTS:
                return 1;
            case CARGO_BAY_ANALOG_SIGNAL:
                return 2;
            case CHARGING_SOURCES_AVAILABLE:
                return 1;
            case OI_MODE:
                return 1;
            case SONG_NUMBER:
                return 1;
            case SONG_PLAYING:
                return 1;
            case NUMBER_OF_STREAM_PACKETS:
                return 1;
            case REQUESTED_VELOCITY:
                return 2;
            case REQUESTED_RADIUS:
                return 2;
            case REQUESTED_RIGHT_VELOCITY:
                return 2;
            case REQUESTED_LEFT_VELOCITY:
                return 2;
        }

        throw new IllegalArgumentException("Unknown sensor packet id: " + packetId);
    }
}
