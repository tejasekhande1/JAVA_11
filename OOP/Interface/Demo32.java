
// MARKER INTERFACE : AN INTERFACE IN WHICH DOES NOT EXIST ANY METHOD ;
// PROOF : COMMAND ----> javap java.lang.String  => (2nd Line) String implements java.io.Serializable  <---- Marker InterFace
// 	   COMMAND ----> javap -c java.io.Serializable ---> public interface java.io.Serializable{ }
// 	   COMMAND ----> javap ic java.lang.Cloneable ------> this also marker interface   
