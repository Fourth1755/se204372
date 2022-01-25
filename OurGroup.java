import java.util.Vector;

public class OurGroup {

    private Vector<String> groupMembers;
    public OurGroup()
    {
        groupMembers = new Vector<String>();
        groupMembers.add("Thanapat Wongtungjaroensuk");
<<<<<<< HEAD
	groupMembers.add("Nuttawat Juntawong");
=======
	    groupMembers.add("Nuttawat Juntawong"); 
>>>>>>> 76d989c772318f864215a6c7d2b48d2599a43a1e
        groupMembers.add("Pooriwat Poolab");//PUT YOUR NAME HERE
        groupMembers.add("Lalita Apirakausanee");//PUT YOUR NAME HERE

    }
    public Vector<String> getGroupMembers () {
        return groupMembers;
    }

}
