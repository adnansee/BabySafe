package me.eddy.bluetoothscanner;

import android.content.Context;
import android.content.Intent;
import android.media.AudioManager;
import android.media.ToneGenerator;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.view.View;
import android.widget.Toast;

import static android.content.Context.VIBRATOR_SERVICE;
import static me.eddy.bluetoothscanner.MainActivity.contextOfApplication;
import static me.eddy.bluetoothscanner.MainActivity.getContextOfApplication;

public class BabyAlert {
    ToneGenerator toneG = new ToneGenerator(AudioManager.STREAM_ALARM, 200);
    String enterDevice = "d8:a0:1d:54:a7:60";
    String enterDevice2 = "D8:A0:1D:54:A7:62";
    String enterDevice3 = "1C:A0:D3:9C:F7:75";

    public void setEnterDevice2(String enterDevice2) {
        this.enterDevice2 = enterDevice2;
    }

    public String getEnterDevice3() {
        return enterDevice3;
    }

    public void setEnterDevice3(String enterDevice3) {
        this.enterDevice3 = enterDevice3;
    }

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
                if((mDevice.getAddress().equals(getEnterDevice2())) && mDevice.getSignal()<-70)
                {toneG.startTone(ToneGenerator.TONE_CDMA_ALERT_CALL_GUARD, 2000);
                    vibratePhone(contextOfApplication, (short) 200);
                    Toast.makeText(contextOfApplication, "DID YOU FORGET SOMETHING?", Toast.LENGTH_SHORT).show();



                }
                }


        }

        catch (Exception e){}

    }

    public void vibrate(int duration)
    {
        Vibrator vibs;

    }
    public static final void vibratePhone(Context context, short vibrateMilliSeconds) {
        Vibrator vibrator = (Vibrator) context.getSystemService(Context.VIBRATOR_SERVICE);
        vibrator.vibrate(vibrateMilliSeconds);
    }
}
