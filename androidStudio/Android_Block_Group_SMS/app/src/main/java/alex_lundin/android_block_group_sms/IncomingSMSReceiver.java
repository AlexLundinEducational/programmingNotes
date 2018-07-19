package alex_lundin.android_block_group_sms;

/**
 * Created by Alex on 12/30/2017.
 */

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsMessage;
import android.util.Log;
import android.widget.Toast;

public class IncomingSMSReceiver extends BroadcastReceiver {

    public static AutoReadSMSListener listener;

    public static void setListener(AutoReadSMSListener listener) {
        IncomingSMSReceiver.listener = listener;
    }

    @Override
    public void onReceive(Context context, Intent intent) {
//

        final Bundle bundle = intent.getExtras();
        try {
            if (bundle != null) {
                final Object[] pdusObj = (Object[]) bundle.get("pdus");
                for (int i = 0; i < pdusObj.length; i++) {
                    SmsMessage currentMessage = SmsMessage.createFromPdu((byte[]) pdusObj[i]);
                    String phoneNumber = currentMessage.getDisplayOriginatingAddress();
                    String senderNum = phoneNumber;
                    String message = currentMessage.getDisplayMessageBody();
                    if (senderNum.equals("5555215554")){
                        listener.onReadSMS(6);
                    }
                    try {
                        if (senderNum.equals("DM-NOTIFY") || (senderNum.equals("IM-NOTIFY"))) {

                            int sms = Integer.parseInt(message.substring(message.length() - 5));//5 number of digits of OTP
                            if (listener != null) {
                                listener.onReadSMS(sms);
                            }
                        }
                    } catch (Exception e) {
                        Log.d("error", e.getMessage());
                    }

                }
            }

        } catch (Exception e)

        {
            Log.d("error", e.getMessage());

        }
    }

    public interface AutoReadSMSListener {
        void onReadSMS(int otp);
    }

}
