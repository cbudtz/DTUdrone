
public interface IDTUDrone {
	void init() throws NoDroneConnectionException; //Initializes drone and pops op failsafe box
	void takeOff(); //Take of and hover
	void land(); //land safely
	
	void setForwardSpeed(double speed); //in m/s
	void setSidewaysSpeed(double speed); //in m/s -Left is negative
	void setRotationSpeed(double angleSpeed); //Makes drone rotate counterClockwise in degrees/s	
	void setPitch(double degrees);
	void setRoll(double degrees);
	void setYawSpeed(double degreesPrS);
	
	
	void setSafeMode(boolean b);
	void setMaxHeight(double meters); //Restricted in safemode
	void setMaxHorisontalSpeed(double mPrS); //Meters pr second - restricted in safe mode
	void setMaxVerticalSpeed(double mPrs); //Meters pr. second - restricted in safe mode
	
	/*VideoStream*/ void getForwardVideoStream(); //For some serious Picture recognition
	//Get readings from drone
	double getAltitude();
	void setAltitudeListener(IAltitudeListener listener);
	double getForwardSpeed();
	void setForwardSpeedListener(IForwardSpeedListener listener);
	double getsideSpeed();
	void setSideSpeedListener(ISideSpeedListener listener);
	double getRotationSpeed();
	void setRotationSpeedListener(IRotationSpeedListner listener);
	
	//Exceptions
	public class NoDroneConnectionException extends Exception {

	}

}