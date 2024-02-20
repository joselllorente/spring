package spring.inyeccioncolecciones;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class JavaCollection {

	private List addressList;
	private Set addressSet;
	private Map addressMap;
	private Properties addressProp;
	
	public JavaCollection(){
		
	}

	public List getAddressList() {
		return addressList;
	}

	public void setAddressList(List addressList) {
		System.out.println("Set address List: "+addressList);
		this.addressList = addressList;
	}

	public Set getAddressSet() {
		return addressSet;
	}

	public void setAddressSet(Set addressSet) {
		System.out.println("Set address Set: "+addressSet);
		this.addressSet = addressSet;
	}

	public Map getAddressMap() {
		return addressMap;
	}

	public void setAddressMap(Map addressMap) {
		System.out.println("Set address Map: "+addressMap);
		this.addressMap = addressMap;
	}

	public Properties getAddressProp() {
		return addressProp;
	}

	public void setAddressProp(Properties addressProp) {
		System.out.println("Set address Properties: "+addressProp);
		this.addressProp = addressProp;
	}
}
