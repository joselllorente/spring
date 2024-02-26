package spring.bbdd.jdbc.pojos;

import java.io.Serializable;

public class Paciente implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name, lastName;
	int roomId, id;
	
	public Paciente() {
	}
	
	public Paciente(String name, String lastName) {
		super();
		this.name = name;
		this.lastName = lastName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getRoomId() {
		return roomId;
	}

	public void setRoomId(int roomId) {
		this.roomId = roomId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Paciente [name=" + name + ", lastName=" + lastName
				+ ", roomId=" + roomId + ", id=" + id + "]";
	}
	
	
	
}
