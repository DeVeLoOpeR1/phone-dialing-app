import java.util.List;

public class mobileUser implements User{
    private int myPhoneNo;
    private boolean powerOn;
    private boolean ringing;

    mobileUser(int myPhoneNo)
    {
        this.myPhoneNo = myPhoneNo;
        //set the power to on
        this.powerOn = true;
        this.ringing=false;

    }
    public int getMyPhoneNo() {
        return myPhoneNo;
    }

    public void setMyPhoneNo(int myPhoneNo) {
        this.myPhoneNo = myPhoneNo;
    }

    public boolean isPowerOn() {
        return this.powerOn;
    }

    public void setPowerOn(boolean powerOn) {
        this.powerOn = powerOn;
    }

    public boolean isRinging() {
        return this.ringing;
    }

    public void setRinging(boolean ringing) {
        this.ringing = ringing;
    }


    @Override
    public boolean powerOn() {
        return this.powerOn;

    }

    @Override
    public String calling(int number , List<mobileUser> userList) {
        for(mobileUser user : userList){
            if(user.myPhoneNo == number && user.isPowerOn())
            {
                user.ringing = true;
                return "phone is ringing.... pls pick up the call";
            }
        }
        return "Invalid Number pls check try after some time later";

    }

    @Override
    public boolean ringing() {
        System.out.println("phone is ringing");
        return this.ringing;
    }

    @Override
    public boolean answering() {
        if(this.ringing==true)
        {
            System.out.println("You answered the call recently there");
            this.setRinging(false);
            return true;

        }
        System.out.println("your phone is not ringing LOL....");
        return false;
    }
}
