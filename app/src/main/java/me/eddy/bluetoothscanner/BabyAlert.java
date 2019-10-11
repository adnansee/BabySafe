package me.eddy.bluetoothscanner;

import android.content.Intent;
import android.media.AudioManager;
import android.media.ToneGenerator;
import android.view.View;
import android.widget.Toast;

import static me.eddy.bluetoothscanner.MainActivity.getContextOfApplication;

public class BabyAlert {
    ToneGenerator toneG = new ToneGenerator(AudioManager.STREAM_ALARM, 50);
    String enterDevice = "d8:a0:1d:54:a7:60";
    String enterDevice2 = "D8:A0:1D:54:A7:62";

    public String getEnterDevice2() {
        return enterDevice2;
    }

    public String getEnterDevice() {
        return enterDevice;
    }

    public void setEnterDevice(String enterDevice) {
        this.enterDevice = enterDevice;
    }

    public ToneGenerator getToneG() {
        return toneG;
    }

    public void setToneG(ToneGenerator toneG) {

        this.toneG = toneG;
    }

    public BabyAlert() {

        this.toneG = toneG;
    }

    public void alertGardian(Device mDevice){

        try{
            if(mDevice.getName()==null){}
            else{
                if((mDevice.getAddress().equals(getEnterDevice2())) && mDevice.getSignal()<-70){toneG.startTone(ToneGenerator.TONE_CDMA_ALERT_CALL_GUARD, 2000);}}}
        catch (Exception e){}

    }


}
