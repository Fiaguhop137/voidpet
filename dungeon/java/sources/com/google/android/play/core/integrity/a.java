package com.google.android.play.core.integrity;

import com.google.android.gms.common.api.Status;
import java.util.Locale;

/* JADX INFO: loaded from: classes2.dex */
public class a extends p135h8.b {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Throwable f37249b;

    a(int i10, Throwable th) {
        super(new Status(i10, String.format(Locale.ROOT, "Integrity API error (%d): %s.", Integer.valueOf(i10), p387v9.a.a(i10))));
        if (i10 == 0) {
            throw new IllegalArgumentException("ErrorCode should not be 0.");
        }
        this.f37249b = th;
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable getCause() {
        return this.f37249b;
    }
}
