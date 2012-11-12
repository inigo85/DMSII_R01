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
 *   Foundation, Inc. 51 Franklin St, Fifth Floor, Boston, MA  02110-1301  USA
 *
 *   Copyright original Java version: 2004 Bart Du Bois, Serge Demeyer
 *   Copyright C++ version: 2006 Matthias Rieger, Bart Van Rompaey
 */
 package lanSimulation.internals;

/**
A <em>Node</em> represents a single Node in a Local Area Network (LAN).
Several types of Nodes exist.
 */
public class Node {
    //enumeration constants specifying all legal node types
    /**
    A node with type NODE has only basic functionality.
    */
    public static final byte NODE = 0;
    /**
    A node with type WORKSTATION may initiate requests on the LAN.
    */
    public static final byte WORKSTATION = 1;
    /**
    A node with type PRINTER may accept packages to be printed.
    */
    public static final byte PRINTER = 2;

    /**
    Holds the type of the Node.
    */
    private byte type_;
    /**
    Holds the name of the Node.
    */
    private String name_;
    /**
    Holds the next Node in the token ring architecture.
    @see lanSimulation.internals.Node
    */
    private Node nextNode_;
    
/**
Construct a <em>Node</em> with given #type and #name.
<p><strong>Precondition:</strong> (type >= NODE) & (type <= PRINTER);</p>
 */
    public Node(byte type, String name) {
        assert (type >= NODE) & (type <= PRINTER);
        setType_(type);
        setName_(name);
        setNextNode_(null);
    }
    
/**
Construct a <em>Node</em> with given #type and #name, and which is linked to #nextNode.
<p><strong>Precondition:</strong> (type >= NODE) & (type <= PRINTER);</p>
 */
    public Node(byte type, String name, Node nextNode) {
        assert (type >= NODE) & (type <= PRINTER);
        setType_(type);
        setName_(name);
        setNextNode_(nextNode);
    }

/**
 * @return the type_
 */
public byte getType_() {
	return type_;
}

/**
 * @param type_ the type_ to set
 */
public void setType_(byte type_) {
	this.type_ = type_;
}

/**
 * @return the name_
 */
public String getName_() {
	return name_;
}

/**
 * @param name_ the name_ to set
 */
public void setName_(String name_) {
	this.name_ = name_;
}

/**
 * @return the nextNode_
 */
public Node getNextNode_() {
	return nextNode_;
}

/**
 * @param nextNode_ the nextNode_ to set
 */
public void setNextNode_(Node nextNode_) {
	this.nextNode_ = nextNode_;
}
            
}