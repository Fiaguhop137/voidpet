package p037c0;

import kotlin.enums.EnumEntries;
import p019b0.g;
import p019b0.i;

/* JADX INFO: loaded from: classes.dex */
public interface o0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f26727a = a.f26728a;

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ a f26728a = new a();

        private a() {
        }
    }

    public enum b {
        CounterClockwise,
        Clockwise;


        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ EnumEntries f26732d = Gd.a.a(e());
    }

    static /* synthetic */ void b(o0 o0Var, g gVar, b bVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addRect");
        }
        if ((i10 & 2) != 0) {
            bVar = b.CounterClockwise;
        }
        o0Var.e(gVar, bVar);
    }

    static /* synthetic */ void c(o0 o0Var, i iVar, b bVar, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addRoundRect");
        }
        if ((i10 & 2) != 0) {
            bVar = b.CounterClockwise;
        }
        o0Var.f(iVar, bVar);
    }

    boolean a();

    void d();

    void e(g gVar, b bVar);

    void f(i iVar, b bVar);

    boolean g(o0 o0Var, o0 o0Var2, int i10);

    g getBounds();

    boolean isEmpty();

    void reset();
}
