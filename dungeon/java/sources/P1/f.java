package P1;

import androidx.lifecycle.InterfaceC1985h;
import androidx.lifecycle.Q;
import androidx.lifecycle.S;
import androidx.lifecycle.U;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f8586a = new f();

    private f() {
    }

    public final O1.a a(U owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        return owner instanceof InterfaceC1985h ? ((InterfaceC1985h) owner).s() : O1.a.b.f8311c;
    }

    public final S.c b(U owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        return owner instanceof InterfaceC1985h ? ((InterfaceC1985h) owner).r() : b.f8580b;
    }

    public final String c(kotlin.reflect.d modelClass) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        String strA = a.a(modelClass);
        if (strA == null) {
            throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
        }
        return "androidx.lifecycle.ViewModelProvider.DefaultKey:" + strA;
    }

    public final Q d() {
        throw new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
    }
}
