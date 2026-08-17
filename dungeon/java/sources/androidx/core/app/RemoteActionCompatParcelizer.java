package androidx.core.app;

import android.app.PendingIntent;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.a;

/* JADX INFO: loaded from: classes.dex */
public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(a aVar) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f23085a = (IconCompat) aVar.v(remoteActionCompat.f23085a, 1);
        remoteActionCompat.f23086b = aVar.l(remoteActionCompat.f23086b, 2);
        remoteActionCompat.f23087c = aVar.l(remoteActionCompat.f23087c, 3);
        remoteActionCompat.f23088d = (PendingIntent) aVar.r(remoteActionCompat.f23088d, 4);
        remoteActionCompat.f23089e = aVar.h(remoteActionCompat.f23089e, 5);
        remoteActionCompat.f23090f = aVar.h(remoteActionCompat.f23090f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, a aVar) {
        aVar.x(false, false);
        aVar.M(remoteActionCompat.f23085a, 1);
        aVar.D(remoteActionCompat.f23086b, 2);
        aVar.D(remoteActionCompat.f23087c, 3);
        aVar.H(remoteActionCompat.f23088d, 4);
        aVar.z(remoteActionCompat.f23089e, 5);
        aVar.z(remoteActionCompat.f23090f, 6);
    }
}
