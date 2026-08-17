package p170j8;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.internal.InterfaceC2318k;

/* JADX INFO: loaded from: classes2.dex */
public abstract class G implements DialogInterface.OnClickListener {
    public static G b(Activity activity, Intent intent, int i10) {
        return new E(intent, activity, i10);
    }

    public static G c(@NonNull InterfaceC2318k interfaceC2318k, Intent intent, int i10) {
        return new F(intent, interfaceC2318k, 2);
    }

    protected abstract void a();

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        try {
            try {
                a();
            } catch (ActivityNotFoundException e10) {
                Log.e("DialogRedirect", true == Build.FINGERPRINT.contains("generic") ? "Failed to start resolution intent. This may occur when resolving Google Play services connection issues on emulators with Google APIs but not Google Play Store." : "Failed to start resolution intent.", e10);
            }
        } finally {
            dialogInterface.dismiss();
        }
    }
}
