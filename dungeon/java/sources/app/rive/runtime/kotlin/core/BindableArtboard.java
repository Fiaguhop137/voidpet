package app.rive.runtime.kotlin.core;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0011\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0003H\u0096 J\u0011\u0010\f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0003H\u0086 R\u0011\u0010\u0005\u001a\u00020\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lapp/rive/runtime/kotlin/core/BindableArtboard;", "Lapp/rive/runtime/kotlin/core/NativeObject;", "unsafeCppPointer", "", "(J)V", "name", "", "getName", "()Ljava/lang/String;", "cppDelete", "", "pointer", "cppName", "kotlin_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
public final class BindableArtboard extends NativeObject {
    public static final int $stable = 0;

    public BindableArtboard(long j10) {
        super(j10);
        acquire();
    }

    @Override // app.rive.runtime.kotlin.core.NativeObject
    public native void cppDelete(long pointer);

    @NotNull
    public final native String cppName(long pointer);

    @NotNull
    public final String getName() {
        return cppName(getCppPointer());
    }
}
