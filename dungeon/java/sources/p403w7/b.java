package p403w7;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.util.Log;
import com.github.penfeizhou.animation.io.Reader;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class b extends com.github.penfeizhou.animation.decode.b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    private static final String f56634A = "b";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private p421x7.b f56635w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private int f56636x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    private final Paint f56637y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    private final C0727b f56638z;

    /* JADX INFO: renamed from: w7.b$b, reason: collision with other inner class name */
    private static class C0727b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        byte f56639a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Rect f56640b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        ByteBuffer f56641c;

        private C0727b() {
            this.f56640b = new Rect();
        }

        /* synthetic */ C0727b(a aVar) {
            this();
        }
    }

    public b(G7.b bVar, com.github.penfeizhou.animation.decode.b.j jVar) {
        super(bVar, jVar);
        Paint paint = new Paint();
        this.f56637y = paint;
        this.f56638z = new C0727b(null);
        paint.setAntiAlias(true);
    }

    @Override // com.github.penfeizhou.animation.decode.b
    protected void M() {
        this.f56638z.f56641c = null;
        this.f56635w = null;
    }

    @Override // com.github.penfeizhou.animation.decode.b
    protected void O(com.github.penfeizhou.animation.decode.a aVar) {
        if (aVar == null || this.f31531p == null) {
            return;
        }
        try {
            Bitmap bitmapI = I(this.f31531p.width() / this.f31526k, this.f31531p.height() / this.f31526k);
            Canvas canvas = (Canvas) this.f31529n.get(bitmapI);
            if (canvas == null) {
                canvas = new Canvas(bitmapI);
                this.f31529n.put(bitmapI, canvas);
            }
            Canvas canvas2 = canvas;
            if (aVar instanceof c) {
                this.f31530o.rewind();
                bitmapI.copyPixelsFromBuffer(this.f31530o);
                if (this.f31520e == 0) {
                    canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
                } else {
                    canvas2.save();
                    canvas2.clipRect(this.f56638z.f56640b);
                    C0727b c0727b = this.f56638z;
                    byte b10 = c0727b.f56639a;
                    if (b10 == 1) {
                        canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
                    } else if (b10 == 2) {
                        c0727b.f56641c.rewind();
                        bitmapI.copyPixelsFromBuffer(this.f56638z.f56641c);
                    }
                    canvas2.restore();
                }
                if (((c) aVar).f56646b == 2) {
                    C0727b c0727b2 = this.f56638z;
                    if (c0727b2.f56639a != 2) {
                        c0727b2.f56641c.rewind();
                        bitmapI.copyPixelsToBuffer(this.f56638z.f56641c);
                    }
                }
                this.f56638z.f56639a = ((c) aVar).f56646b;
                canvas2.save();
                if (((c) aVar).f56645a == 0) {
                    int i10 = aVar.frameX;
                    int i11 = this.f31526k;
                    int i12 = aVar.frameY;
                    canvas2.clipRect(i10 / i11, i12 / i11, (i10 + aVar.frameWidth) / i11, (i12 + aVar.frameHeight) / i11);
                    canvas2.drawColor(0, PorterDuff.Mode.CLEAR);
                }
                Rect rect = this.f56638z.f56640b;
                int i13 = aVar.frameX;
                int i14 = this.f31526k;
                int i15 = aVar.frameY;
                rect.set(i13 / i14, i15 / i14, (i13 + aVar.frameWidth) / i14, (i15 + aVar.frameHeight) / i14);
                canvas2.restore();
            }
            Bitmap bitmapI2 = I(aVar.frameWidth, aVar.frameHeight);
            L(aVar.draw(canvas2, this.f56637y, this.f31526k, bitmapI2, C()));
            L(bitmapI2);
            this.f31530o.rewind();
            bitmapI.copyPixelsToBuffer(this.f31530o);
            L(bitmapI);
        } catch (Exception e10) {
            e10.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.penfeizhou.animation.decode.b
    /* JADX INFO: renamed from: W, reason: merged with bridge method [inline-methods] */
    public p421x7.a A(Reader reader) {
        return new p421x7.a(reader);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.penfeizhou.animation.decode.b
    /* JADX INFO: renamed from: X, reason: merged with bridge method [inline-methods] */
    public p421x7.b C() {
        if (this.f56635w == null) {
            this.f56635w = new p421x7.b();
        }
        return this.f56635w;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.github.penfeizhou.animation.decode.b
    /* JADX INFO: renamed from: Y, reason: merged with bridge method [inline-methods] */
    public Rect K(p421x7.a aVar) throws d.a {
        List<e> listB = d.b(aVar);
        ArrayList arrayList = new ArrayList();
        byte[] bArr = new byte[0];
        c cVar = null;
        boolean z10 = false;
        int i10 = 0;
        int i11 = 0;
        for (e eVar : listB) {
            boolean z11 = eVar instanceof i;
            if (z11) {
                Log.e(f56634A, "chunk read reach to end");
                break;
            }
            if (eVar instanceof p403w7.a) {
                this.f56636x = ((p403w7.a) eVar).f56633f;
                z10 = true;
            } else if (eVar instanceof f) {
                cVar = new c(aVar, (f) eVar);
                cVar.f56649e = arrayList;
                cVar.f56647c = bArr;
                this.f31519d.add(cVar);
            } else if (eVar instanceof g) {
                if (cVar != null) {
                    cVar.f56648d.add(eVar);
                }
            } else if (eVar instanceof h) {
                if (!z10) {
                    k kVar = new k(aVar);
                    kVar.frameWidth = i10;
                    kVar.frameHeight = i11;
                    this.f31519d.add(kVar);
                    this.f56636x = 1;
                    break;
                }
                if (cVar != null) {
                    cVar.f56648d.add(eVar);
                }
            } else if (eVar instanceof j) {
                j jVar = (j) eVar;
                i10 = jVar.f56669e;
                i11 = jVar.f56670f;
                bArr = jVar.f56671g;
            } else if (!z11) {
                arrayList.add(eVar);
            }
        }
        int i12 = i10 * i11;
        int i13 = this.f31526k;
        this.f31530o = ByteBuffer.allocate(((i12 / (i13 * i13)) + 1) * 4);
        C0727b c0727b = this.f56638z;
        int i14 = this.f31526k;
        c0727b.f56641c = ByteBuffer.allocate(((i12 / (i14 * i14)) + 1) * 4);
        return new Rect(0, 0, i10, i11);
    }

    @Override // com.github.penfeizhou.animation.decode.b
    protected int x() {
        return this.f56636x;
    }
}
