/*
 * Impulse Server Manager for Velocity
 * Copyright (c) 2025  Dabb1e
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as
 * published by the Free Software Foundation, either version 3 of the
 * License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */

package club.arson.impulse.api.config

import kotlinx.serialization.Serializable

/**
 * Represents the configuration for Impulse
 *
 * @property instanceName A unique identifier for this instance of Impulse
 * @property servers A list of server configurations. See [ServerConfig]
 * @property serverMaintenanceInterval The interval in seconds between server maintenance tasks
 * @property messages Messages to be displayed to players. See [Messages]
 * @property limboServerName The name of the fallback/limbo server (must match a server in Velocity config, Limbo is automatically enabled if this is set)
 */
@Serializable
data class Configuration(
    var instanceName: String = "velocity",
    var servers: List<ServerConfig> = listOf(),
    var serverMaintenanceInterval: Long = 300,
    var messages: Messages = Messages(),
    var limboServerName: String? = null // Name of the fallback/limbo server, automatically enables Limbo if set
)