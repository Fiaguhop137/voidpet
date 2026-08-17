package p091f0;

import android.graphics.Outline;
import p037c0.L;
import p037c0.o0;

/* JADX INFO: loaded from: classes.dex */
public final class Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Q f41580a = new Q();

    private Q() {
    }

    public final void a(Outline outline, o0 o0Var) {
        if (!(o0Var instanceof L)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        outline.setPath(((L) o0Var).h());
    }
}
