package p037c0;

import android.graphics.Path;
import android.graphics.RectF;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import p019b0.g;
import p019b0.i;

/* JADX INFO: loaded from: classes.dex */
public final class L implements o0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Path f26676b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private RectF f26677c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float[] f26678d;

    public L(Path path) {
        this.f26676b = path;
    }

    public /* synthetic */ L(Path path, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? new Path() : path);
    }

    private final void i(g gVar) {
        if (Float.isNaN(gVar.e()) || Float.isNaN(gVar.h()) || Float.isNaN(gVar.f()) || Float.isNaN(gVar.c())) {
            M.c("Invalid rectangle, make sure no value is NaN");
        }
    }

    @Override // p037c0.o0
    public boolean a() {
        return this.f26676b.isConvex();
    }

    @Override // p037c0.o0
    public void d() {
        this.f26676b.rewind();
    }

    @Override // p037c0.o0
    public void e(g gVar, o0.b bVar) {
        i(gVar);
        if (this.f26677c == null) {
            this.f26677c = new RectF();
        }
        RectF rectF = this.f26677c;
        Intrinsics.c(rectF);
        rectF.set(gVar.e(), gVar.h(), gVar.f(), gVar.c());
        Path path = this.f26676b;
        RectF rectF2 = this.f26677c;
        Intrinsics.c(rectF2);
        path.addRect(rectF2, M.d(bVar));
    }

    @Override // p037c0.o0
    public void f(i iVar, o0.b bVar) {
        if (this.f26677c == null) {
            this.f26677c = new RectF();
        }
        RectF rectF = this.f26677c;
        Intrinsics.c(rectF);
        rectF.set(iVar.e(), iVar.g(), iVar.f(), iVar.a());
        if (this.f26678d == null) {
            this.f26678d = new float[8];
        }
        float[] fArr = this.f26678d;
        Intrinsics.c(fArr);
        fArr[0] = Float.intBitsToFloat((int) (iVar.h() >> 32));
        fArr[1] = Float.intBitsToFloat((int) (iVar.h() & 4294967295L));
        fArr[2] = Float.intBitsToFloat((int) (iVar.i() >> 32));
        fArr[3] = Float.intBitsToFloat((int) (iVar.i() & 4294967295L));
        fArr[4] = Float.intBitsToFloat((int) (iVar.c() >> 32));
        fArr[5] = Float.intBitsToFloat((int) (iVar.c() & 4294967295L));
        fArr[6] = Float.intBitsToFloat((int) (iVar.b() >> 32));
        fArr[7] = Float.intBitsToFloat((int) (iVar.b() & 4294967295L));
        Path path = this.f26676b;
        RectF rectF2 = this.f26677c;
        Intrinsics.c(rectF2);
        float[] fArr2 = this.f26678d;
        Intrinsics.c(fArr2);
        path.addRoundRect(rectF2, fArr2, M.d(bVar));
    }

    @Override // p037c0.o0
    public boolean g(o0 o0Var, o0 o0Var2, int i10) {
        Path.Op op;
        q0.a aVar = q0.f26733a;
        if (q0.f(i10, aVar.a())) {
            op = Path.Op.DIFFERENCE;
        } else if (q0.f(i10, aVar.b())) {
            op = Path.Op.INTERSECT;
        } else if (q0.f(i10, aVar.c())) {
            op = Path.Op.REVERSE_DIFFERENCE;
        } else {
            op = q0.f(i10, aVar.d()) ? Path.Op.UNION : Path.Op.XOR;
        }
        Path path = this.f26676b;
        if (!(o0Var instanceof L)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        Path pathH = ((L) o0Var).h();
        if (o0Var2 instanceof L) {
            return path.op(pathH, ((L) o0Var2).h(), op);
        }
        throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
    }

    @Override // p037c0.o0
    public g getBounds() {
        if (this.f26677c == null) {
            this.f26677c = new RectF();
        }
        RectF rectF = this.f26677c;
        Intrinsics.c(rectF);
        this.f26676b.computeBounds(rectF, true);
        return new g(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    public final Path h() {
        return this.f26676b;
    }

    @Override // p037c0.o0
    public boolean isEmpty() {
        return this.f26676b.isEmpty();
    }

    @Override // p037c0.o0
    public void reset() {
        this.f26676b.reset();
    }
}
