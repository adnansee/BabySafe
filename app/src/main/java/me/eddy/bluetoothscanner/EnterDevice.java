package me.eddy.bluetoothscanner;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.widget.EditText;

public class EnterDevice extends Activity {
    String enterDevice = "NONE";

    public void setEnterDevice(Editable enterDevice) {
        this.enterDevice = String.valueOf(enterDevice);
    }

    Context contextOfApplication;

    public Context getContextOfApplication() {
        return contextOfApplication;
    }

    public final String SETTINGS_PREFERENCES_FILE_NAME = "SETTINGS_PREFERENCES";

        @Override
        public void onCreate( Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.enter_device);
            contextOfApplication = getContextOfApplication();
            initView();
        }

    private void initView() {
        EditText editText = findViewById(R.id.enter_device);
        sendDevice(editText);
        setEnterDevice(editText.getText());

    }

    private String sendDevice(EditText editText) {


    return null;}


}
