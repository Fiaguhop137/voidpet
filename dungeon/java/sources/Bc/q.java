package Bc;

import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.content.Context;
import android.graphics.Color;
import android.media.AudioAttributes;
import android.net.Uri;
import android.provider.Settings;
import com.google.android.gms.common.AbstractC2340i;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class q implements s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Y0.p f653a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private r f654b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final p408wc.e f655c;

    public q(Context context, r rVar) {
        this.f653a = Y0.p.h(context);
        this.f655c = new p408wc.e(context);
        this.f654b = rVar;
    }

    @Override // Bc.s
    public void a(String str) {
        this.f653a.f(str);
    }

    @Override // Bc.s
    public NotificationChannel b(String str) {
        return this.f653a.k(str);
    }

    @Override // Bc.s
    public NotificationChannel c(String str, CharSequence charSequence, int i10, p191kb.b bVar) {
        NotificationChannel notificationChannelA = AbstractC2340i.a(str, charSequence, i10);
        e(notificationChannelA, bVar);
        this.f653a.d(notificationChannelA);
        return this.f653a.k(str);
    }

    @Override // Bc.s
    public List d() {
        return this.f653a.n();
    }

    protected void e(Object obj, p191kb.b bVar) {
        Fc.e eVarG;
        if (e.a(obj)) {
            NotificationChannel notificationChannelA = Ac.i.a(obj);
            if (bVar.g("bypassDnd")) {
                notificationChannelA.setBypassDnd(bVar.getBoolean("bypassDnd"));
            }
            if (bVar.g("description")) {
                notificationChannelA.setDescription(bVar.getString("description"));
            }
            if (bVar.g("lightColor")) {
                notificationChannelA.setLightColor(Color.parseColor(bVar.getString("lightColor")));
            }
            if (bVar.g("groupId")) {
                String string = bVar.getString("groupId");
                NotificationChannelGroup notificationChannelGroupC = this.f654b.c(string);
                if (notificationChannelGroupC == null) {
                    notificationChannelGroupC = this.f654b.a(string, string, new p191kb.a());
                }
                notificationChannelA.setGroup(notificationChannelGroupC.getId());
            }
            if (bVar.g("lockscreenVisibility") && (eVarG = Fc.e.g(bVar.getInt("lockscreenVisibility"))) != null) {
                notificationChannelA.setLockscreenVisibility(eVarG.o());
            }
            if (bVar.g("showBadge")) {
                notificationChannelA.setShowBadge(bVar.getBoolean("showBadge"));
            }
            if (bVar.g("sound") || bVar.g("audioAttributes")) {
                notificationChannelA.setSound(g(bVar), f(bVar.d("audioAttributes")));
            }
            if (bVar.g("vibrationPattern")) {
                notificationChannelA.setVibrationPattern(h(bVar.b("vibrationPattern")));
            }
            if (bVar.g("enableLights")) {
                notificationChannelA.enableLights(bVar.getBoolean("enableLights"));
            }
            if (bVar.g("enableVibrate")) {
                notificationChannelA.enableVibration(bVar.getBoolean("enableVibrate"));
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected AudioAttributes f(p191kb.b bVar) {
        int i10;
        if (bVar == null) {
            return null;
        }
        AudioAttributes.Builder builder = new AudioAttributes.Builder();
        if (bVar.g("usage")) {
            builder.setUsage(Fc.b.g(bVar.getInt("usage")).o());
        }
        if (bVar.g("contentType")) {
            builder.setContentType(Fc.a.g(bVar.getInt("contentType")).o());
        }
        if (bVar.g("flags")) {
            p191kb.b bVarD = bVar.d("flags");
            boolean z10 = bVarD.getBoolean("enforceAudibility");
            if (bVarD.getBoolean("requestHardwareAudioVideoSynchronization")) {
                i10 = z10;
                i10 = (z10 ? 1 : 0) | 16;
            }
            i10 = z10;
            builder.setFlags(i10);
        }
        return builder.build();
    }

    protected Uri g(p191kb.b bVar) {
        if (!bVar.g("sound")) {
            return Settings.System.DEFAULT_NOTIFICATION_URI;
        }
        String string = bVar.getString("sound");
        if (string == null) {
            return null;
        }
        return this.f655c.b(string);
    }

    protected long[] h(List list) {
        if (list == null) {
            return null;
        }
        long[] jArr = new long[list.size()];
        for (int i10 = 0; i10 < list.size(); i10++) {
            if (!(list.get(i10) instanceof Number)) {
                throw new Ac.g(i10, list.get(i10));
            }
            jArr[i10] = ((Number) list.get(i10)).longValue();
        }
        return jArr;
    }
}
