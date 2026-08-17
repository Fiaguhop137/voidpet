package p075e2;

import Y1.b;
import android.os.Build;
import java.util.UUID;

/* JADX INFO: loaded from: classes.dex */
public final class B implements b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final boolean f40228d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final UUID f40229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final byte[] f40230b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f40231c;

    /* JADX WARN: Code duplicated, block: B:9:0x001e  */
    static {
        boolean z10;
        if ("Amazon".equals(Build.MANUFACTURER)) {
            String str = Build.MODEL;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z10 = true;
            } else {
                z10 = false;
            }
        } else {
            z10 = false;
        }
        f40228d = z10;
    }

    public B(UUID uuid, byte[] bArr) {
        this(uuid, bArr, false);
    }

    public B(UUID uuid, byte[] bArr, boolean z10) {
        this.f40229a = uuid;
        this.f40230b = bArr;
        this.f40231c = z10;
    }
}
