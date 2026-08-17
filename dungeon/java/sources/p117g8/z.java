package p117g8;

import android.os.Bundle;

/* JADX INFO: loaded from: classes2.dex */
final class z extends A {
    z(int i10, int i11, Bundle bundle) {
        super(i10, i11, bundle);
    }

    @Override // p117g8.A
    final void a(Bundle bundle) {
        if (bundle.getBoolean("ack", false)) {
            d(null);
        } else {
            c(new B(4, "Invalid response to one way request", null));
        }
    }

    @Override // p117g8.A
    final boolean b() {
        return true;
    }
}
