package Cc;

import android.app.NotificationChannel;
import android.graphics.Color;
import android.media.AudioAttributes;
import android.net.Uri;
import android.os.Bundle;
import android.provider.Settings;

/* JADX INFO: loaded from: classes2.dex */
public class s implements u {
    private Bundle d(AudioAttributes audioAttributes) {
        if (audioAttributes == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putInt("usage", Fc.b.h(audioAttributes.getUsage()).i());
        bundle.putInt("contentType", Fc.a.h(audioAttributes.getContentType()).i());
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("requestHardwareAudioVideoSynchronization", (audioAttributes.getFlags() & 16) > 0);
        bundle2.putBoolean("enforceAudibility", (audioAttributes.getFlags() & 1) > 0);
        bundle.putBundle("flags", bundle2);
        return bundle;
    }

    private String e(Uri uri) {
        if (uri == null) {
            return null;
        }
        return Settings.System.DEFAULT_NOTIFICATION_URI.equals(uri) ? "default" : "custom";
    }

    @Override // Cc.u
    public Bundle a(NotificationChannel notificationChannel) {
        if (notificationChannel == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        bundle.putString("id", b(notificationChannel));
        bundle.putString("name", notificationChannel.getName().toString());
        bundle.putInt("importance", Fc.c.h(notificationChannel.getImportance()).i());
        bundle.putBoolean("bypassDnd", notificationChannel.canBypassDnd());
        bundle.putString("description", notificationChannel.getDescription());
        bundle.putString("groupId", c(notificationChannel));
        bundle.putString("lightColor", String.format("#%08x", Integer.valueOf(Color.valueOf(notificationChannel.getLightColor()).toArgb())).toUpperCase());
        bundle.putInt("lockscreenVisibility", Fc.e.h(notificationChannel.getLockscreenVisibility()).i());
        bundle.putBoolean("showBadge", notificationChannel.canShowBadge());
        bundle.putString("sound", e(notificationChannel.getSound()));
        bundle.putBundle("audioAttributes", d(notificationChannel.getAudioAttributes()));
        bundle.putLongArray("vibrationPattern", notificationChannel.getVibrationPattern());
        bundle.putBoolean("enableLights", notificationChannel.shouldShowLights());
        bundle.putBoolean("enableVibrate", notificationChannel.shouldVibrate());
        return bundle;
    }

    protected String b(NotificationChannel notificationChannel) {
        return notificationChannel.getId();
    }

    protected String c(NotificationChannel notificationChannel) {
        return notificationChannel.getGroup();
    }
}
