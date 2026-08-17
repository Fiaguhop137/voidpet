package p138hb;

import android.media.AudioDeviceInfo;
import android.os.Bundle;
import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public abstract class o {
    public static final File a(File dir) throws IOException {
        Intrinsics.checkNotNullParameter(dir, "dir");
        if (dir.isDirectory() || dir.mkdirs()) {
            return dir;
        }
        throw new IOException("Couldn't create directory '" + dir + "'");
    }

    public static final Bundle b(AudioDeviceInfo deviceInfo) {
        String str;
        Intrinsics.checkNotNullParameter(deviceInfo, "deviceInfo");
        Bundle bundle = new Bundle();
        int type = deviceInfo.getType();
        if (type == 3) {
            str = "MicrophoneWired";
        } else if (type == 15) {
            str = "MicrophoneBuiltIn";
        } else if (type == 18) {
            str = "Telephony";
        } else if (type != 7) {
            str = type != 8 ? "Unknown device type" : "BluetoothA2DP";
        } else {
            str = "BluetoothSCO";
        }
        bundle.putString("name", deviceInfo.getProductName().toString());
        bundle.putString("type", str);
        bundle.putString("uid", String.valueOf(deviceInfo.getId()));
        return bundle;
    }
}
