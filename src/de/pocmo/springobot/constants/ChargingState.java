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
package de.pocmo.springobot.constants;

/**
 * Constants for the charging state as returned by the charging
 * sensor.
 *
 * @author Sebastian Kaspari <s.kaspari@gmail.com>
 */
public class ChargingState
{
    public static int NOT_CHARGING = 0;
    public static int RECONDITIONING_CHARGING = 1;
    public static int FULL_CHARGING = 2;
    public static int TRICKLE_CHARGING = 3;
    public static int WAITING = 4;
    public static int CHARGING_FAULT_CONDITION = 5;
}
