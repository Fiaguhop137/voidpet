package com.facebook.yoga;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
@p313r7.a
public abstract class YogaNodeJNIBase extends r implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private YogaNodeJNIBase f31410a;

    @p313r7.a
    private float[] arr;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private c f31411b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private List f31412c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private o f31413d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private b f31414e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected long f31415f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Object f31416g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f31417h;

    @p313r7.a
    private int mLayoutDirection;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f31418a;

        static {
            int[] iArr = new int[j.values().length];
            f31418a = iArr;
            try {
                iArr[j.LEFT.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f31418a[j.TOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f31418a[j.RIGHT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f31418a[j.BOTTOM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f31418a[j.START.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f31418a[j.END.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    YogaNodeJNIBase() {
        this(YogaNative.jni_YGNodeNewJNI());
    }

    private YogaNodeJNIBase(long j10) {
        this.arr = null;
        this.mLayoutDirection = 0;
        this.f31417h = true;
        if (j10 == 0) {
            throw new IllegalStateException("Failed to allocate native memory");
        }
        this.f31415f = j10;
    }

    YogaNodeJNIBase(c cVar) {
        this(YogaNative.jni_YGNodeNewWithConfigJNI(((e) cVar).f31436a));
        this.f31411b = cVar;
    }

    @p313r7.a
    private final long replaceChild(YogaNodeJNIBase yogaNodeJNIBase, int i10) {
        List list = this.f31412c;
        if (list == null) {
            throw new IllegalStateException("Cannot replace child. YogaNode does not have children");
        }
        list.remove(i10);
        this.f31412c.add(i10, yogaNodeJNIBase);
        yogaNodeJNIBase.f31410a = this;
        return yogaNodeJNIBase.f31415f;
    }

    private void s0(r rVar) {
        t0();
    }

    private static YogaValue w0(long j10) {
        return new YogaValue(Float.intBitsToFloat((int) j10), (int) (j10 >> 32));
    }

    @Override // com.facebook.yoga.r
    public void A(j jVar, float f10) {
        YogaNative.jni_YGNodeStyleSetBorderJNI(this.f31415f, jVar.h(), f10);
    }

    @Override // com.facebook.yoga.r
    public void B(Object obj) {
        this.f31416g = obj;
    }

    @Override // com.facebook.yoga.r
    public void C(h hVar) {
        YogaNative.jni_YGNodeStyleSetDirectionJNI(this.f31415f, hVar.h());
    }

    @Override // com.facebook.yoga.r
    public void D(i iVar) {
        YogaNative.jni_YGNodeStyleSetDisplayJNI(this.f31415f, iVar.g());
    }

    @Override // com.facebook.yoga.r
    public void E(float f10) {
        YogaNative.jni_YGNodeStyleSetFlexJNI(this.f31415f, f10);
    }

    @Override // com.facebook.yoga.r
    public void F(float f10) {
        YogaNative.jni_YGNodeStyleSetFlexBasisJNI(this.f31415f, f10);
    }

    @Override // com.facebook.yoga.r
    public void H() {
        YogaNative.jni_YGNodeStyleSetFlexBasisAutoJNI(this.f31415f);
    }

    @Override // com.facebook.yoga.r
    public void I(float f10) {
        YogaNative.jni_YGNodeStyleSetFlexBasisPercentJNI(this.f31415f, f10);
    }

    @Override // com.facebook.yoga.r
    public void J(l lVar) {
        YogaNative.jni_YGNodeStyleSetFlexDirectionJNI(this.f31415f, lVar.g());
    }

    @Override // com.facebook.yoga.r
    public void K(float f10) {
        YogaNative.jni_YGNodeStyleSetFlexGrowJNI(this.f31415f, f10);
    }

    @Override // com.facebook.yoga.r
    public void M(float f10) {
        YogaNative.jni_YGNodeStyleSetFlexShrinkJNI(this.f31415f, f10);
    }

    @Override // com.facebook.yoga.r
    public void N(m mVar, float f10) {
        YogaNative.jni_YGNodeStyleSetGapJNI(this.f31415f, mVar.g(), f10);
    }

    @Override // com.facebook.yoga.r
    public void O(m mVar, float f10) {
        YogaNative.jni_YGNodeStyleSetGapPercentJNI(this.f31415f, mVar.g(), f10);
    }

    @Override // com.facebook.yoga.r
    public void P(float f10) {
        YogaNative.jni_YGNodeStyleSetHeightJNI(this.f31415f, f10);
    }

    @Override // com.facebook.yoga.r
    public void Q() {
        YogaNative.jni_YGNodeStyleSetHeightAutoJNI(this.f31415f);
    }

    @Override // com.facebook.yoga.r
    public void R(float f10) {
        YogaNative.jni_YGNodeStyleSetHeightPercentJNI(this.f31415f, f10);
    }

    @Override // com.facebook.yoga.r
    public void S(n nVar) {
        YogaNative.jni_YGNodeStyleSetJustifyContentJNI(this.f31415f, nVar.g());
    }

    @Override // com.facebook.yoga.r
    public void T(j jVar, float f10) {
        YogaNative.jni_YGNodeStyleSetMarginJNI(this.f31415f, jVar.h(), f10);
    }

    @Override // com.facebook.yoga.r
    public void U(j jVar) {
        YogaNative.jni_YGNodeStyleSetMarginAutoJNI(this.f31415f, jVar.h());
    }

    @Override // com.facebook.yoga.r
    public void V(j jVar, float f10) {
        YogaNative.jni_YGNodeStyleSetMarginPercentJNI(this.f31415f, jVar.h(), f10);
    }

    @Override // com.facebook.yoga.r
    public void W(float f10) {
        YogaNative.jni_YGNodeStyleSetMaxHeightJNI(this.f31415f, f10);
    }

    @Override // com.facebook.yoga.r
    public void X(float f10) {
        YogaNative.jni_YGNodeStyleSetMaxHeightPercentJNI(this.f31415f, f10);
    }

    @Override // com.facebook.yoga.r
    public void Y(float f10) {
        YogaNative.jni_YGNodeStyleSetMaxWidthJNI(this.f31415f, f10);
    }

    @Override // com.facebook.yoga.r
    public void Z(float f10) {
        YogaNative.jni_YGNodeStyleSetMaxWidthPercentJNI(this.f31415f, f10);
    }

    @Override // com.facebook.yoga.r
    public void a0(o oVar) {
        this.f31413d = oVar;
        YogaNative.jni_YGNodeSetHasMeasureFuncJNI(this.f31415f, oVar != null);
    }

    @Override // com.facebook.yoga.r
    public void b(r rVar, int i10) {
        if (rVar instanceof YogaNodeJNIBase) {
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) rVar;
            if (yogaNodeJNIBase.f31410a != null) {
                throw new IllegalStateException("Child already has a parent, it must be removed first.");
            }
            if (this.f31412c == null) {
                this.f31412c = new ArrayList(4);
            }
            this.f31412c.add(i10, yogaNodeJNIBase);
            yogaNodeJNIBase.f31410a = this;
            YogaNative.jni_YGNodeInsertChildJNI(this.f31415f, yogaNodeJNIBase.f31415f, i10);
        }
    }

    @Override // com.facebook.yoga.r
    public void b0(float f10) {
        YogaNative.jni_YGNodeStyleSetMinHeightJNI(this.f31415f, f10);
    }

    @p313r7.a
    public final float baseline(float f10, float f11) {
        return this.f31414e.a(this, f10, f11);
    }

    @Override // com.facebook.yoga.r
    public void c(float f10, float f11) {
        s0(null);
        ArrayList arrayList = new ArrayList();
        arrayList.add(this);
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) arrayList.get(i10);
            List<YogaNodeJNIBase> list = yogaNodeJNIBase.f31412c;
            if (list != null) {
                for (YogaNodeJNIBase yogaNodeJNIBase2 : list) {
                    yogaNodeJNIBase2.s0(yogaNodeJNIBase);
                    arrayList.add(yogaNodeJNIBase2);
                }
            }
        }
        YogaNodeJNIBase[] yogaNodeJNIBaseArr = (YogaNodeJNIBase[]) arrayList.toArray(new YogaNodeJNIBase[arrayList.size()]);
        long[] jArr = new long[yogaNodeJNIBaseArr.length];
        for (int i11 = 0; i11 < yogaNodeJNIBaseArr.length; i11++) {
            jArr[i11] = yogaNodeJNIBaseArr[i11].f31415f;
        }
        YogaNative.jni_YGNodeCalculateLayoutJNI(this.f31415f, f10, f11, jArr, yogaNodeJNIBaseArr);
    }

    @Override // com.facebook.yoga.r
    public void d() {
        YogaNative.jni_YGNodeMarkDirtyJNI(this.f31415f);
    }

    @Override // com.facebook.yoga.r
    public void d0(float f10) {
        YogaNative.jni_YGNodeStyleSetMinHeightPercentJNI(this.f31415f, f10);
    }

    @Override // com.facebook.yoga.r
    public YogaValue e() {
        return w0(YogaNative.jni_YGNodeStyleGetHeightJNI(this.f31415f));
    }

    @Override // com.facebook.yoga.r
    public h f() {
        float[] fArr = this.arr;
        return h.g(fArr != null ? (int) fArr[5] : this.mLayoutDirection);
    }

    @Override // com.facebook.yoga.r
    public void f0(float f10) {
        YogaNative.jni_YGNodeStyleSetMinWidthJNI(this.f31415f, f10);
    }

    @Override // com.facebook.yoga.r
    public float g() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[2];
        }
        return 0.0f;
    }

    @Override // com.facebook.yoga.r
    public void g0(float f10) {
        YogaNative.jni_YGNodeStyleSetMinWidthPercentJNI(this.f31415f, f10);
    }

    @Override // com.facebook.yoga.r
    public float h(j jVar) {
        float[] fArr = this.arr;
        if (fArr == null) {
            return 0.0f;
        }
        float f10 = fArr[0];
        if ((((int) f10) & 2) != 2) {
            return 0.0f;
        }
        int i10 = (((int) f10) & 1) != 1 ? 4 : 0;
        int i11 = 10 - i10;
        switch (a.f31418a[jVar.ordinal()]) {
            case 1:
                return this.arr[i11];
            case 2:
                return this.arr[11 - i10];
            case 3:
                return this.arr[12 - i10];
            case 4:
                return this.arr[13 - i10];
            case 5:
                return f() == h.RTL ? this.arr[12 - i10] : this.arr[i11];
            case 6:
                return f() == h.RTL ? this.arr[i11] : this.arr[12 - i10];
            default:
                throw new IllegalArgumentException("Cannot get layout paddings of multi-edge shorthands");
        }
    }

    @Override // com.facebook.yoga.r
    public void i0(u uVar) {
        YogaNative.jni_YGNodeStyleSetOverflowJNI(this.f31415f, uVar.g());
    }

    @Override // com.facebook.yoga.r
    public float j() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[1];
        }
        return 0.0f;
    }

    @Override // com.facebook.yoga.r
    public void j0(j jVar, float f10) {
        YogaNative.jni_YGNodeStyleSetPaddingJNI(this.f31415f, jVar.h(), f10);
    }

    @Override // com.facebook.yoga.r
    public void k0(j jVar, float f10) {
        YogaNative.jni_YGNodeStyleSetPaddingPercentJNI(this.f31415f, jVar.h(), f10);
    }

    @Override // com.facebook.yoga.r
    public float l() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[3];
        }
        return 0.0f;
    }

    @Override // com.facebook.yoga.r
    public void l0(j jVar, float f10) {
        YogaNative.jni_YGNodeStyleSetPositionJNI(this.f31415f, jVar.h(), f10);
    }

    @Override // com.facebook.yoga.r
    public float m() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return fArr[4];
        }
        return 0.0f;
    }

    @Override // com.facebook.yoga.r
    public void m0(j jVar, float f10) {
        YogaNative.jni_YGNodeStyleSetPositionPercentJNI(this.f31415f, jVar.h(), f10);
    }

    @p313r7.a
    public final long measure(float f10, int i10, float f11, int i11) {
        if (q()) {
            return this.f31413d.C(this, f10, p.g(i10), f11, p.g(i11));
        }
        throw new RuntimeException("Measure function isn't defined!");
    }

    @Override // com.facebook.yoga.r
    public YogaValue n() {
        return w0(YogaNative.jni_YGNodeStyleGetWidthJNI(this.f31415f));
    }

    @Override // com.facebook.yoga.r
    public void n0(v vVar) {
        YogaNative.jni_YGNodeStyleSetPositionTypeJNI(this.f31415f, vVar.g());
    }

    @Override // com.facebook.yoga.r
    public boolean o() {
        float[] fArr = this.arr;
        if (fArr != null) {
            return (((int) fArr[0]) & 16) == 16;
        }
        return this.f31417h;
    }

    @Override // com.facebook.yoga.r
    public void o0(float f10) {
        YogaNative.jni_YGNodeStyleSetWidthJNI(this.f31415f, f10);
    }

    @Override // com.facebook.yoga.r
    public boolean p() {
        return YogaNative.jni_YGNodeIsDirtyJNI(this.f31415f);
    }

    @Override // com.facebook.yoga.r
    public void p0() {
        YogaNative.jni_YGNodeStyleSetWidthAutoJNI(this.f31415f);
    }

    @Override // com.facebook.yoga.r
    public boolean q() {
        return this.f31413d != null;
    }

    @Override // com.facebook.yoga.r
    public void q0(float f10) {
        YogaNative.jni_YGNodeStyleSetWidthPercentJNI(this.f31415f, f10);
    }

    @Override // com.facebook.yoga.r
    public void r() {
        float[] fArr = this.arr;
        if (fArr != null) {
            fArr[0] = ((int) fArr[0]) & (-17);
        }
        this.f31417h = false;
    }

    @Override // com.facebook.yoga.r
    public void r0(x xVar) {
        YogaNative.jni_YGNodeStyleSetFlexWrapJNI(this.f31415f, xVar.g());
    }

    public Object t0() {
        return this.f31416g;
    }

    @Override // com.facebook.yoga.r
    public void u() {
        this.f31413d = null;
        this.f31414e = null;
        this.f31416g = null;
        this.arr = null;
        this.f31417h = true;
        this.mLayoutDirection = 0;
        YogaNative.jni_YGNodeResetJNI(this.f31415f);
    }

    @Override // com.facebook.yoga.r
    /* JADX INFO: renamed from: u0, reason: merged with bridge method [inline-methods] */
    public YogaNodeJNIBase s(int i10) {
        List list = this.f31412c;
        if (list == null) {
            throw new IllegalStateException("Trying to remove a child of a YogaNode that does not have children");
        }
        YogaNodeJNIBase yogaNodeJNIBase = (YogaNodeJNIBase) list.remove(i10);
        yogaNodeJNIBase.f31410a = null;
        YogaNative.jni_YGNodeRemoveChildJNI(this.f31415f, yogaNodeJNIBase.f31415f);
        return yogaNodeJNIBase;
    }

    @Override // com.facebook.yoga.r
    public void v(com.facebook.yoga.a aVar) {
        YogaNative.jni_YGNodeStyleSetAlignContentJNI(this.f31415f, aVar.g());
    }

    @Override // com.facebook.yoga.r
    public void w(com.facebook.yoga.a aVar) {
        YogaNative.jni_YGNodeStyleSetAlignItemsJNI(this.f31415f, aVar.g());
    }

    @Override // com.facebook.yoga.r
    public void x(com.facebook.yoga.a aVar) {
        YogaNative.jni_YGNodeStyleSetAlignSelfJNI(this.f31415f, aVar.g());
    }

    @Override // com.facebook.yoga.r
    public void y(float f10) {
        YogaNative.jni_YGNodeStyleSetAspectRatioJNI(this.f31415f, f10);
    }

    @Override // com.facebook.yoga.r
    public void z(b bVar) {
        this.f31414e = bVar;
        YogaNative.jni_YGNodeSetHasBaselineFuncJNI(this.f31415f, bVar != null);
    }
}
