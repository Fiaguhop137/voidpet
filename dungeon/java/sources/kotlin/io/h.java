package kotlin.io;

import java.io.File;
import java.io.IOException;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes3.dex */
public class h extends IOException {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f48298a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final File f48299b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final String f48300c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(File file, File file2, String str) {
        super(d.b(file, file2, str));
        Intrinsics.checkNotNullParameter(file, "file");
        this.f48298a = file;
        this.f48299b = file2;
        this.f48300c = str;
    }

    public /* synthetic */ h(File file, File file2, String str, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(file, (i10 & 2) != 0 ? null : file2, (i10 & 4) != 0 ? null : str);
    }
}
