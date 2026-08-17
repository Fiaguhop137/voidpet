package Fc;

/* JADX INFO: loaded from: classes2.dex */
public enum b {
    UNKNOWN(0, 0),
    MEDIA(1, 1),
    VOICE_COMMUNICATION(2, 2),
    VOICE_COMMUNICATION_SIGNALLING(3, 3),
    ALARM(4, 4),
    NOTIFICATION(5, 5),
    NOTIFICATION_RINGTONE(6, 6),
    NOTIFICATION_COMMUNICATION_REQUEST(7, 7),
    NOTIFICATION_COMMUNICATION_INSTANT(8, 8),
    NOTIFICATION_COMMUNICATION_DELAYED(9, 9),
    NOTIFICATION_EVENT(10, 10),
    ASSISTANCE_ACCESSIBILITY(11, 11),
    ASSISTANCE_NAVIGATION_GUIDANCE(12, 12),
    ASSISTANCE_SONIFICATION(13, 13),
    GAME(14, 14);


    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f3024a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f3025b;

    b(int i10, int i11) {
        this.f3024a = i10;
        this.f3025b = i11;
    }

    public static b g(int i10) {
        for (b bVar : values()) {
            if (bVar.i() == i10) {
                return bVar;
            }
        }
        return UNKNOWN;
    }

    public static b h(int i10) {
        for (b bVar : values()) {
            if (bVar.i() == i10) {
                return bVar;
            }
        }
        return UNKNOWN;
    }

    public int i() {
        return this.f3025b;
    }

    public int o() {
        return this.f3024a;
    }
}
