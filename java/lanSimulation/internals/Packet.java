/*   This file is part of lanSimulation.
 *
 *   lanSimulation is free software; you can redistribute it and/or modify
 *   it under the terms of the GNU General Public License as published by
 *   the Free Software Foundation; either version 2 of the License, or
 *   (at your option) any later version.
 *
 *   lanSimulation is distributed in the hope that it will be useful,
 *   but WITHOUT ANY WARRANTY; without even the implied warranty of
 *   MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *   GNU General Public License for more details.
 *
 *   You should have received a copy of the GNU General Public License
 *   along with lanSimulation; if not, write to the Free Software
 *   Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 *
 *   Copyright original Java version: 2004 Bart Du Bois, Serge Demeyer
 *   Copyright C++ version: 2006 Matthias Rieger, Bart Van Rompaey
 */
package lanSimulation.internals;

/**
A <em>Packet</em> represents a unit of information to be sent over the Local Area Network (LAN).
 */
public class Packet {
    /**
    Holds the actual message to be send over the network.
    */
    private String message_;
    /**
    Holds the name of the Node which initiated the request.
    */
    private String origin_;
    /**
    Holds the name of the Node which should receive the information.
    */
    private String destination_;

/**
Construct a <em>Packet</em> with given #message and #destination.
 */
    public Packet(String message, String destination) {
	setMessage_(message);
        setOrigin_("");
	setDestination_(destination);
    }
    
/**
Construct a <em>Packet</em> with given #message, #origin and #receiver.
 */
    public Packet(String message, String origin, String destination) {
	setMessage_(message);
	setOrigin_(origin);
        setDestination_(destination);
    }

public String getMessage_() {
	return message_;
}

public void setMessage_(String message_) {
	this.message_ = message_;
}

public String getOrigin_() {
	return origin_;
}

public void setOrigin_(String origin_) {
	this.origin_ = origin_;
}

public String getDestination_() {
	return destination_;
}

public void setDestination_(String destination_) {
	this.destination_ = destination_;
}


    
}