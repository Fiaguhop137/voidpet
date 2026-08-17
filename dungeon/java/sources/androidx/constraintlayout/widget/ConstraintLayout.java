package androidx.constraintlayout.widget;

import U0.l;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    SparseArray f22446a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ArrayList f22447b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected U0.f f22448c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f22449d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f22450e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f22451f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f22452g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected boolean f22453h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f22454i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private e f22455j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    protected d f22456k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f22457l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private HashMap f22458m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f22459n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f22460o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    int f22461p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    int f22462q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    int f22463r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    int f22464s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private SparseArray f22465t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    c f22466u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f22467v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f22468w;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f22469a;

        static {
            int[] iArr = new int[U0.e.b.values().length];
            f22469a = iArr;
            try {
                iArr[U0.e.b.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f22469a[U0.e.b.WRAP_CONTENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f22469a[U0.e.b.MATCH_PARENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f22469a[U0.e.b.MATCH_CONSTRAINT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public static class b extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public float f22470A;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public String f22471B;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        float f22472C;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        int f22473D;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public float f22474E;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        public float f22475F;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        public int f22476G;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        public int f22477H;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        public int f22478I;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        public int f22479J;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        public int f22480K;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        public int f22481L;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        public int f22482M;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        public int f22483N;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public float f22484O;

        /* JADX INFO: renamed from: P, reason: collision with root package name */
        public float f22485P;

        /* JADX INFO: renamed from: Q, reason: collision with root package name */
        public int f22486Q;

        /* JADX INFO: renamed from: R, reason: collision with root package name */
        public int f22487R;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        public int f22488S;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        public boolean f22489T;

        /* JADX INFO: renamed from: U, reason: collision with root package name */
        public boolean f22490U;

        /* JADX INFO: renamed from: V, reason: collision with root package name */
        public String f22491V;

        /* JADX INFO: renamed from: W, reason: collision with root package name */
        boolean f22492W;

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        boolean f22493X;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        boolean f22494Y;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        boolean f22495Z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f22496a;

        /* JADX INFO: renamed from: a0, reason: collision with root package name */
        boolean f22497a0;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f22498b;

        /* JADX INFO: renamed from: b0, reason: collision with root package name */
        boolean f22499b0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f22500c;

        /* JADX INFO: renamed from: c0, reason: collision with root package name */
        boolean f22501c0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f22502d;

        /* JADX INFO: renamed from: d0, reason: collision with root package name */
        int f22503d0;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f22504e;

        /* JADX INFO: renamed from: e0, reason: collision with root package name */
        int f22505e0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f22506f;

        /* JADX INFO: renamed from: f0, reason: collision with root package name */
        int f22507f0;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f22508g;

        /* JADX INFO: renamed from: g0, reason: collision with root package name */
        int f22509g0;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f22510h;

        /* JADX INFO: renamed from: h0, reason: collision with root package name */
        int f22511h0;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f22512i;

        /* JADX INFO: renamed from: i0, reason: collision with root package name */
        int f22513i0;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f22514j;

        /* JADX INFO: renamed from: j0, reason: collision with root package name */
        float f22515j0;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f22516k;

        /* JADX INFO: renamed from: k0, reason: collision with root package name */
        int f22517k0;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f22518l;

        /* JADX INFO: renamed from: l0, reason: collision with root package name */
        int f22519l0;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f22520m;

        /* JADX INFO: renamed from: m0, reason: collision with root package name */
        float f22521m0;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f22522n;

        /* JADX INFO: renamed from: n0, reason: collision with root package name */
        U0.e f22523n0;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public float f22524o;

        /* JADX INFO: renamed from: o0, reason: collision with root package name */
        public boolean f22525o0;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f22526p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f22527q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f22528r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f22529s;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f22530t;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public int f22531u;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public int f22532v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public int f22533w;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f22534x;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f22535y;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public float f22536z;

        private static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final SparseIntArray f22537a;

            static {
                SparseIntArray sparseIntArray = new SparseIntArray();
                f22537a = sparseIntArray;
                sparseIntArray.append(i.f22925l2, 8);
                sparseIntArray.append(i.f22932m2, 9);
                sparseIntArray.append(i.f22946o2, 10);
                sparseIntArray.append(i.f22953p2, 11);
                sparseIntArray.append(i.f22995v2, 12);
                sparseIntArray.append(i.f22988u2, 13);
                sparseIntArray.append(i.f22805T1, 14);
                sparseIntArray.append(i.f22799S1, 15);
                sparseIntArray.append(i.f22787Q1, 16);
                sparseIntArray.append(i.f22811U1, 2);
                sparseIntArray.append(i.f22823W1, 3);
                sparseIntArray.append(i.f22817V1, 4);
                sparseIntArray.append(i.f22710D2, 49);
                sparseIntArray.append(i.f22716E2, 50);
                sparseIntArray.append(i.f22848a2, 5);
                sparseIntArray.append(i.f22855b2, 6);
                sparseIntArray.append(i.f22862c2, 7);
                sparseIntArray.append(i.f22854b1, 1);
                sparseIntArray.append(i.f22960q2, 17);
                sparseIntArray.append(i.f22967r2, 18);
                sparseIntArray.append(i.f22841Z1, 19);
                sparseIntArray.append(i.f22835Y1, 20);
                sparseIntArray.append(i.f22734H2, 21);
                sparseIntArray.append(i.f22752K2, 22);
                sparseIntArray.append(i.f22740I2, 23);
                sparseIntArray.append(i.f22722F2, 24);
                sparseIntArray.append(i.f22746J2, 25);
                sparseIntArray.append(i.f22728G2, 26);
                sparseIntArray.append(i.f22897h2, 29);
                sparseIntArray.append(i.f23002w2, 30);
                sparseIntArray.append(i.f22829X1, 44);
                sparseIntArray.append(i.f22911j2, 45);
                sparseIntArray.append(i.f23014y2, 46);
                sparseIntArray.append(i.f22904i2, 47);
                sparseIntArray.append(i.f23008x2, 48);
                sparseIntArray.append(i.f22775O1, 27);
                sparseIntArray.append(i.f22769N1, 28);
                sparseIntArray.append(i.f23020z2, 31);
                sparseIntArray.append(i.f22869d2, 32);
                sparseIntArray.append(i.f22698B2, 33);
                sparseIntArray.append(i.f22692A2, 34);
                sparseIntArray.append(i.f22704C2, 35);
                sparseIntArray.append(i.f22883f2, 36);
                sparseIntArray.append(i.f22876e2, 37);
                sparseIntArray.append(i.f22890g2, 38);
                sparseIntArray.append(i.f22918k2, 39);
                sparseIntArray.append(i.f22981t2, 40);
                sparseIntArray.append(i.f22939n2, 41);
                sparseIntArray.append(i.f22793R1, 42);
                sparseIntArray.append(i.f22781P1, 43);
                sparseIntArray.append(i.f22974s2, 51);
            }
        }

        public b(int i10, int i11) {
            super(i10, i11);
            this.f22496a = -1;
            this.f22498b = -1;
            this.f22500c = -1.0f;
            this.f22502d = -1;
            this.f22504e = -1;
            this.f22506f = -1;
            this.f22508g = -1;
            this.f22510h = -1;
            this.f22512i = -1;
            this.f22514j = -1;
            this.f22516k = -1;
            this.f22518l = -1;
            this.f22520m = -1;
            this.f22522n = 0;
            this.f22524o = 0.0f;
            this.f22526p = -1;
            this.f22527q = -1;
            this.f22528r = -1;
            this.f22529s = -1;
            this.f22530t = -1;
            this.f22531u = -1;
            this.f22532v = -1;
            this.f22533w = -1;
            this.f22534x = -1;
            this.f22535y = -1;
            this.f22536z = 0.5f;
            this.f22470A = 0.5f;
            this.f22471B = null;
            this.f22472C = 0.0f;
            this.f22473D = 1;
            this.f22474E = -1.0f;
            this.f22475F = -1.0f;
            this.f22476G = 0;
            this.f22477H = 0;
            this.f22478I = 0;
            this.f22479J = 0;
            this.f22480K = 0;
            this.f22481L = 0;
            this.f22482M = 0;
            this.f22483N = 0;
            this.f22484O = 1.0f;
            this.f22485P = 1.0f;
            this.f22486Q = -1;
            this.f22487R = -1;
            this.f22488S = -1;
            this.f22489T = false;
            this.f22490U = false;
            this.f22491V = null;
            this.f22492W = true;
            this.f22493X = true;
            this.f22494Y = false;
            this.f22495Z = false;
            this.f22497a0 = false;
            this.f22499b0 = false;
            this.f22501c0 = false;
            this.f22503d0 = -1;
            this.f22505e0 = -1;
            this.f22507f0 = -1;
            this.f22509g0 = -1;
            this.f22511h0 = -1;
            this.f22513i0 = -1;
            this.f22515j0 = 0.5f;
            this.f22523n0 = new U0.e();
            this.f22525o0 = false;
        }

        public b(Context context, AttributeSet attributeSet) {
            int i10;
            super(context, attributeSet);
            this.f22496a = -1;
            this.f22498b = -1;
            this.f22500c = -1.0f;
            this.f22502d = -1;
            this.f22504e = -1;
            this.f22506f = -1;
            this.f22508g = -1;
            this.f22510h = -1;
            this.f22512i = -1;
            this.f22514j = -1;
            this.f22516k = -1;
            this.f22518l = -1;
            this.f22520m = -1;
            this.f22522n = 0;
            this.f22524o = 0.0f;
            this.f22526p = -1;
            this.f22527q = -1;
            this.f22528r = -1;
            this.f22529s = -1;
            this.f22530t = -1;
            this.f22531u = -1;
            this.f22532v = -1;
            this.f22533w = -1;
            this.f22534x = -1;
            this.f22535y = -1;
            this.f22536z = 0.5f;
            this.f22470A = 0.5f;
            this.f22471B = null;
            this.f22472C = 0.0f;
            this.f22473D = 1;
            this.f22474E = -1.0f;
            this.f22475F = -1.0f;
            this.f22476G = 0;
            this.f22477H = 0;
            this.f22478I = 0;
            this.f22479J = 0;
            this.f22480K = 0;
            this.f22481L = 0;
            this.f22482M = 0;
            this.f22483N = 0;
            this.f22484O = 1.0f;
            this.f22485P = 1.0f;
            this.f22486Q = -1;
            this.f22487R = -1;
            this.f22488S = -1;
            this.f22489T = false;
            this.f22490U = false;
            this.f22491V = null;
            this.f22492W = true;
            this.f22493X = true;
            this.f22494Y = false;
            this.f22495Z = false;
            this.f22497a0 = false;
            this.f22499b0 = false;
            this.f22501c0 = false;
            this.f22503d0 = -1;
            this.f22505e0 = -1;
            this.f22507f0 = -1;
            this.f22509g0 = -1;
            this.f22511h0 = -1;
            this.f22513i0 = -1;
            this.f22515j0 = 0.5f;
            this.f22523n0 = new U0.e();
            this.f22525o0 = false;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f22847a1);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i11 = 0; i11 < indexCount; i11++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i11);
                int i12 = a.f22537a.get(index);
                switch (i12) {
                    case 1:
                        this.f22488S = typedArrayObtainStyledAttributes.getInt(index, this.f22488S);
                        break;
                    case 2:
                        int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, this.f22520m);
                        this.f22520m = resourceId;
                        if (resourceId == -1) {
                            this.f22520m = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 3:
                        this.f22522n = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22522n);
                        break;
                    case 4:
                        float f10 = typedArrayObtainStyledAttributes.getFloat(index, this.f22524o) % 360.0f;
                        this.f22524o = f10;
                        if (f10 < 0.0f) {
                            this.f22524o = (360.0f - f10) % 360.0f;
                        }
                        break;
                    case 5:
                        this.f22496a = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f22496a);
                        break;
                    case 6:
                        this.f22498b = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f22498b);
                        break;
                    case 7:
                        this.f22500c = typedArrayObtainStyledAttributes.getFloat(index, this.f22500c);
                        break;
                    case 8:
                        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, this.f22502d);
                        this.f22502d = resourceId2;
                        if (resourceId2 == -1) {
                            this.f22502d = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 9:
                        int resourceId3 = typedArrayObtainStyledAttributes.getResourceId(index, this.f22504e);
                        this.f22504e = resourceId3;
                        if (resourceId3 == -1) {
                            this.f22504e = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 10:
                        int resourceId4 = typedArrayObtainStyledAttributes.getResourceId(index, this.f22506f);
                        this.f22506f = resourceId4;
                        if (resourceId4 == -1) {
                            this.f22506f = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 11:
                        int resourceId5 = typedArrayObtainStyledAttributes.getResourceId(index, this.f22508g);
                        this.f22508g = resourceId5;
                        if (resourceId5 == -1) {
                            this.f22508g = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 12:
                        int resourceId6 = typedArrayObtainStyledAttributes.getResourceId(index, this.f22510h);
                        this.f22510h = resourceId6;
                        if (resourceId6 == -1) {
                            this.f22510h = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 13:
                        int resourceId7 = typedArrayObtainStyledAttributes.getResourceId(index, this.f22512i);
                        this.f22512i = resourceId7;
                        if (resourceId7 == -1) {
                            this.f22512i = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 14:
                        int resourceId8 = typedArrayObtainStyledAttributes.getResourceId(index, this.f22514j);
                        this.f22514j = resourceId8;
                        if (resourceId8 == -1) {
                            this.f22514j = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 15:
                        int resourceId9 = typedArrayObtainStyledAttributes.getResourceId(index, this.f22516k);
                        this.f22516k = resourceId9;
                        if (resourceId9 == -1) {
                            this.f22516k = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 16:
                        int resourceId10 = typedArrayObtainStyledAttributes.getResourceId(index, this.f22518l);
                        this.f22518l = resourceId10;
                        if (resourceId10 == -1) {
                            this.f22518l = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 17:
                        int resourceId11 = typedArrayObtainStyledAttributes.getResourceId(index, this.f22526p);
                        this.f22526p = resourceId11;
                        if (resourceId11 == -1) {
                            this.f22526p = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 18:
                        int resourceId12 = typedArrayObtainStyledAttributes.getResourceId(index, this.f22527q);
                        this.f22527q = resourceId12;
                        if (resourceId12 == -1) {
                            this.f22527q = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 19:
                        int resourceId13 = typedArrayObtainStyledAttributes.getResourceId(index, this.f22528r);
                        this.f22528r = resourceId13;
                        if (resourceId13 == -1) {
                            this.f22528r = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 20:
                        int resourceId14 = typedArrayObtainStyledAttributes.getResourceId(index, this.f22529s);
                        this.f22529s = resourceId14;
                        if (resourceId14 == -1) {
                            this.f22529s = typedArrayObtainStyledAttributes.getInt(index, -1);
                        }
                        break;
                    case 21:
                        this.f22530t = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22530t);
                        break;
                    case 22:
                        this.f22531u = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22531u);
                        break;
                    case 23:
                        this.f22532v = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22532v);
                        break;
                    case 24:
                        this.f22533w = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22533w);
                        break;
                    case 25:
                        this.f22534x = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22534x);
                        break;
                    case 26:
                        this.f22535y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22535y);
                        break;
                    case 27:
                        this.f22489T = typedArrayObtainStyledAttributes.getBoolean(index, this.f22489T);
                        break;
                    case 28:
                        this.f22490U = typedArrayObtainStyledAttributes.getBoolean(index, this.f22490U);
                        break;
                    case 29:
                        this.f22536z = typedArrayObtainStyledAttributes.getFloat(index, this.f22536z);
                        break;
                    case 30:
                        this.f22470A = typedArrayObtainStyledAttributes.getFloat(index, this.f22470A);
                        break;
                    case 31:
                        int i13 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.f22478I = i13;
                        if (i13 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintWidth_default=\"wrap\" is deprecated.\nUse layout_width=\"WRAP_CONTENT\" and layout_constrainedWidth=\"true\" instead.");
                        }
                        break;
                    case 32:
                        int i14 = typedArrayObtainStyledAttributes.getInt(index, 0);
                        this.f22479J = i14;
                        if (i14 == 1) {
                            Log.e("ConstraintLayout", "layout_constraintHeight_default=\"wrap\" is deprecated.\nUse layout_height=\"WRAP_CONTENT\" and layout_constrainedHeight=\"true\" instead.");
                        }
                        break;
                    case 33:
                        try {
                            this.f22480K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22480K);
                        } catch (Exception unused) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f22480K) == -2) {
                                this.f22480K = -2;
                            }
                        }
                        break;
                    case 34:
                        try {
                            this.f22482M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22482M);
                        } catch (Exception unused2) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f22482M) == -2) {
                                this.f22482M = -2;
                            }
                        }
                        break;
                    case 35:
                        this.f22484O = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.f22484O));
                        this.f22478I = 2;
                        break;
                    case 36:
                        try {
                            this.f22481L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22481L);
                        } catch (Exception unused3) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f22481L) == -2) {
                                this.f22481L = -2;
                            }
                        }
                        break;
                    case 37:
                        try {
                            this.f22483N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22483N);
                        } catch (Exception unused4) {
                            if (typedArrayObtainStyledAttributes.getInt(index, this.f22483N) == -2) {
                                this.f22483N = -2;
                            }
                        }
                        break;
                    case 38:
                        this.f22485P = Math.max(0.0f, typedArrayObtainStyledAttributes.getFloat(index, this.f22485P));
                        this.f22479J = 2;
                        break;
                    default:
                        switch (i12) {
                            case 44:
                                String string = typedArrayObtainStyledAttributes.getString(index);
                                this.f22471B = string;
                                this.f22472C = Float.NaN;
                                this.f22473D = -1;
                                if (string != null) {
                                    int length = string.length();
                                    int iIndexOf = this.f22471B.indexOf(44);
                                    if (iIndexOf <= 0 || iIndexOf >= length - 1) {
                                        i10 = 0;
                                    } else {
                                        String strSubstring = this.f22471B.substring(0, iIndexOf);
                                        if (strSubstring.equalsIgnoreCase("W")) {
                                            this.f22473D = 0;
                                        } else if (strSubstring.equalsIgnoreCase("H")) {
                                            this.f22473D = 1;
                                        }
                                        i10 = iIndexOf + 1;
                                    }
                                    int iIndexOf2 = this.f22471B.indexOf(58);
                                    if (iIndexOf2 < 0 || iIndexOf2 >= length - 1) {
                                        String strSubstring2 = this.f22471B.substring(i10);
                                        if (strSubstring2.length() > 0) {
                                            this.f22472C = Float.parseFloat(strSubstring2);
                                        }
                                    } else {
                                        String strSubstring3 = this.f22471B.substring(i10, iIndexOf2);
                                        String strSubstring4 = this.f22471B.substring(iIndexOf2 + 1);
                                        if (strSubstring3.length() > 0 && strSubstring4.length() > 0) {
                                            try {
                                                float f11 = Float.parseFloat(strSubstring3);
                                                float f12 = Float.parseFloat(strSubstring4);
                                                if (f11 > 0.0f && f12 > 0.0f) {
                                                    if (this.f22473D == 1) {
                                                        this.f22472C = Math.abs(f12 / f11);
                                                    } else {
                                                        this.f22472C = Math.abs(f11 / f12);
                                                    }
                                                }
                                            } catch (NumberFormatException unused5) {
                                            }
                                        }
                                    }
                                }
                                break;
                            case 45:
                                this.f22474E = typedArrayObtainStyledAttributes.getFloat(index, this.f22474E);
                                break;
                            case 46:
                                this.f22475F = typedArrayObtainStyledAttributes.getFloat(index, this.f22475F);
                                break;
                            case 47:
                                this.f22476G = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 48:
                                this.f22477H = typedArrayObtainStyledAttributes.getInt(index, 0);
                                break;
                            case 49:
                                this.f22486Q = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f22486Q);
                                break;
                            case 50:
                                this.f22487R = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f22487R);
                                break;
                            case 51:
                                this.f22491V = typedArrayObtainStyledAttributes.getString(index);
                                break;
                        }
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
            a();
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f22496a = -1;
            this.f22498b = -1;
            this.f22500c = -1.0f;
            this.f22502d = -1;
            this.f22504e = -1;
            this.f22506f = -1;
            this.f22508g = -1;
            this.f22510h = -1;
            this.f22512i = -1;
            this.f22514j = -1;
            this.f22516k = -1;
            this.f22518l = -1;
            this.f22520m = -1;
            this.f22522n = 0;
            this.f22524o = 0.0f;
            this.f22526p = -1;
            this.f22527q = -1;
            this.f22528r = -1;
            this.f22529s = -1;
            this.f22530t = -1;
            this.f22531u = -1;
            this.f22532v = -1;
            this.f22533w = -1;
            this.f22534x = -1;
            this.f22535y = -1;
            this.f22536z = 0.5f;
            this.f22470A = 0.5f;
            this.f22471B = null;
            this.f22472C = 0.0f;
            this.f22473D = 1;
            this.f22474E = -1.0f;
            this.f22475F = -1.0f;
            this.f22476G = 0;
            this.f22477H = 0;
            this.f22478I = 0;
            this.f22479J = 0;
            this.f22480K = 0;
            this.f22481L = 0;
            this.f22482M = 0;
            this.f22483N = 0;
            this.f22484O = 1.0f;
            this.f22485P = 1.0f;
            this.f22486Q = -1;
            this.f22487R = -1;
            this.f22488S = -1;
            this.f22489T = false;
            this.f22490U = false;
            this.f22491V = null;
            this.f22492W = true;
            this.f22493X = true;
            this.f22494Y = false;
            this.f22495Z = false;
            this.f22497a0 = false;
            this.f22499b0 = false;
            this.f22501c0 = false;
            this.f22503d0 = -1;
            this.f22505e0 = -1;
            this.f22507f0 = -1;
            this.f22509g0 = -1;
            this.f22511h0 = -1;
            this.f22513i0 = -1;
            this.f22515j0 = 0.5f;
            this.f22523n0 = new U0.e();
            this.f22525o0 = false;
        }

        public void a() {
            this.f22495Z = false;
            this.f22492W = true;
            this.f22493X = true;
            int i10 = ((ViewGroup.MarginLayoutParams) this).width;
            if (i10 == -2 && this.f22489T) {
                this.f22492W = false;
                if (this.f22478I == 0) {
                    this.f22478I = 1;
                }
            }
            int i11 = ((ViewGroup.MarginLayoutParams) this).height;
            if (i11 == -2 && this.f22490U) {
                this.f22493X = false;
                if (this.f22479J == 0) {
                    this.f22479J = 1;
                }
            }
            if (i10 == 0 || i10 == -1) {
                this.f22492W = false;
                if (i10 == 0 && this.f22478I == 1) {
                    ((ViewGroup.MarginLayoutParams) this).width = -2;
                    this.f22489T = true;
                }
            }
            if (i11 == 0 || i11 == -1) {
                this.f22493X = false;
                if (i11 == 0 && this.f22479J == 1) {
                    ((ViewGroup.MarginLayoutParams) this).height = -2;
                    this.f22490U = true;
                }
            }
            if (this.f22500c == -1.0f && this.f22496a == -1 && this.f22498b == -1) {
                return;
            }
            this.f22495Z = true;
            this.f22492W = true;
            this.f22493X = true;
            if (!(this.f22523n0 instanceof U0.h)) {
                this.f22523n0 = new U0.h();
            }
            ((U0.h) this.f22523n0).R0(this.f22488S);
        }

        /* JADX WARN: Code duplicated, block: B:17:0x0048  */
        /* JADX WARN: Code duplicated, block: B:20:0x004f  */
        /* JADX WARN: Code duplicated, block: B:23:0x0056  */
        /* JADX WARN: Code duplicated, block: B:26:0x005c  */
        /* JADX WARN: Code duplicated, block: B:29:0x0062  */
        /* JADX WARN: Code duplicated, block: B:36:0x0074  */
        /* JADX WARN: Code duplicated, block: B:37:0x007c A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:38:0x007e  */
        /* JADX WARN: Code duplicated, block: B:39:0x0085 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:40:0x0087  */
        @Override // android.view.ViewGroup.MarginLayoutParams, android.view.ViewGroup.LayoutParams
        public void resolveLayoutDirection(int i10) {
            int i11;
            int i12;
            int i13;
            int i14;
            int i15 = ((ViewGroup.MarginLayoutParams) this).leftMargin;
            int i16 = ((ViewGroup.MarginLayoutParams) this).rightMargin;
            super.resolveLayoutDirection(i10);
            boolean z10 = false;
            boolean z11 = 1 == getLayoutDirection();
            this.f22507f0 = -1;
            this.f22509g0 = -1;
            this.f22503d0 = -1;
            this.f22505e0 = -1;
            this.f22511h0 = this.f22530t;
            this.f22513i0 = this.f22532v;
            float f10 = this.f22536z;
            this.f22515j0 = f10;
            int i17 = this.f22496a;
            this.f22517k0 = i17;
            int i18 = this.f22498b;
            this.f22519l0 = i18;
            float f11 = this.f22500c;
            this.f22521m0 = f11;
            if (z11) {
                int i19 = this.f22526p;
                if (i19 != -1) {
                    this.f22507f0 = i19;
                } else {
                    int i20 = this.f22527q;
                    if (i20 != -1) {
                        this.f22509g0 = i20;
                    } else {
                        i11 = this.f22528r;
                        if (i11 != -1) {
                            this.f22505e0 = i11;
                            z10 = true;
                        }
                        i12 = this.f22529s;
                        if (i12 != -1) {
                            this.f22503d0 = i12;
                            z10 = true;
                        }
                        i13 = this.f22534x;
                        if (i13 != -1) {
                            this.f22513i0 = i13;
                        }
                        i14 = this.f22535y;
                        if (i14 != -1) {
                            this.f22511h0 = i14;
                        }
                        if (z10) {
                            this.f22515j0 = 1.0f - f10;
                        }
                        if (this.f22495Z && this.f22488S == 1) {
                            if (f11 != -1.0f) {
                                this.f22521m0 = 1.0f - f11;
                                this.f22517k0 = -1;
                                this.f22519l0 = -1;
                            } else if (i17 != -1) {
                                this.f22519l0 = i17;
                                this.f22517k0 = -1;
                                this.f22521m0 = -1.0f;
                            } else if (i18 != -1) {
                                this.f22517k0 = i18;
                                this.f22519l0 = -1;
                                this.f22521m0 = -1.0f;
                            }
                        }
                    }
                }
                z10 = true;
                i11 = this.f22528r;
                if (i11 != -1) {
                    this.f22505e0 = i11;
                    z10 = true;
                }
                i12 = this.f22529s;
                if (i12 != -1) {
                    this.f22503d0 = i12;
                    z10 = true;
                }
                i13 = this.f22534x;
                if (i13 != -1) {
                    this.f22513i0 = i13;
                }
                i14 = this.f22535y;
                if (i14 != -1) {
                    this.f22511h0 = i14;
                }
                if (z10) {
                    this.f22515j0 = 1.0f - f10;
                }
                if (this.f22495Z) {
                    if (f11 != -1.0f) {
                        this.f22521m0 = 1.0f - f11;
                        this.f22517k0 = -1;
                        this.f22519l0 = -1;
                    } else if (i17 != -1) {
                        this.f22519l0 = i17;
                        this.f22517k0 = -1;
                        this.f22521m0 = -1.0f;
                    } else if (i18 != -1) {
                        this.f22517k0 = i18;
                        this.f22519l0 = -1;
                        this.f22521m0 = -1.0f;
                    }
                }
            } else {
                int i21 = this.f22526p;
                if (i21 != -1) {
                    this.f22505e0 = i21;
                }
                int i22 = this.f22527q;
                if (i22 != -1) {
                    this.f22503d0 = i22;
                }
                int i23 = this.f22528r;
                if (i23 != -1) {
                    this.f22507f0 = i23;
                }
                int i24 = this.f22529s;
                if (i24 != -1) {
                    this.f22509g0 = i24;
                }
                int i25 = this.f22534x;
                if (i25 != -1) {
                    this.f22511h0 = i25;
                }
                int i26 = this.f22535y;
                if (i26 != -1) {
                    this.f22513i0 = i26;
                }
            }
            if (this.f22528r == -1 && this.f22529s == -1 && this.f22527q == -1 && this.f22526p == -1) {
                int i27 = this.f22506f;
                if (i27 != -1) {
                    this.f22507f0 = i27;
                    if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i16 > 0) {
                        ((ViewGroup.MarginLayoutParams) this).rightMargin = i16;
                    }
                } else {
                    int i28 = this.f22508g;
                    if (i28 != -1) {
                        this.f22509g0 = i28;
                        if (((ViewGroup.MarginLayoutParams) this).rightMargin <= 0 && i16 > 0) {
                            ((ViewGroup.MarginLayoutParams) this).rightMargin = i16;
                        }
                    }
                }
                int i29 = this.f22502d;
                if (i29 != -1) {
                    this.f22503d0 = i29;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i15 <= 0) {
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i15;
                    return;
                }
                int i30 = this.f22504e;
                if (i30 != -1) {
                    this.f22505e0 = i30;
                    if (((ViewGroup.MarginLayoutParams) this).leftMargin > 0 || i15 <= 0) {
                        return;
                    }
                    ((ViewGroup.MarginLayoutParams) this).leftMargin = i15;
                }
            }
        }
    }

    class c implements V0.b.InterfaceC0191b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        ConstraintLayout f22538a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f22539b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f22540c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f22541d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f22542e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f22543f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        int f22544g;

        public c(ConstraintLayout constraintLayout) {
            this.f22538a = constraintLayout;
        }

        @Override // V0.b.InterfaceC0191b
        public final void a() {
            int childCount = this.f22538a.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                this.f22538a.getChildAt(i10);
            }
            int size = this.f22538a.f22447b.size();
            if (size > 0) {
                for (int i11 = 0; i11 < size; i11++) {
                    ((androidx.constraintlayout.widget.c) this.f22538a.f22447b.get(i11)).j(this.f22538a);
                }
            }
        }

        /* JADX WARN: Code duplicated, block: B:101:0x0182 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:110:0x0196  */
        /* JADX WARN: Code duplicated, block: B:112:0x019a  */
        /* JADX WARN: Code duplicated, block: B:115:0x01a8  */
        /* JADX WARN: Code duplicated, block: B:118:0x01b9  */
        /* JADX WARN: Code duplicated, block: B:119:0x01c0  */
        /* JADX WARN: Code duplicated, block: B:121:0x01c8  */
        /* JADX WARN: Code duplicated, block: B:122:0x01cf  */
        /* JADX WARN: Code duplicated, block: B:125:0x01d9  */
        /* JADX WARN: Code duplicated, block: B:126:0x01de  */
        /* JADX WARN: Code duplicated, block: B:129:0x01e3  */
        /* JADX WARN: Code duplicated, block: B:132:0x01eb  */
        /* JADX WARN: Code duplicated, block: B:133:0x01f0  */
        /* JADX WARN: Code duplicated, block: B:136:0x01f5  */
        /* JADX WARN: Code duplicated, block: B:139:0x01fd A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:141:0x0206 A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:142:0x0208 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:145:0x0212 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:146:0x0214  */
        /* JADX WARN: Code duplicated, block: B:148:0x0218  */
        /* JADX WARN: Code duplicated, block: B:150:0x021e  */
        /* JADX WARN: Code duplicated, block: B:153:0x0235  */
        /* JADX WARN: Code duplicated, block: B:154:0x0238  */
        /* JADX WARN: Code duplicated, block: B:157:0x023e  */
        /* JADX WARN: Code duplicated, block: B:161:0x0246  */
        /* JADX WARN: Code duplicated, block: B:164:0x024e  */
        /* JADX WARN: Code duplicated, block: B:166:0x0252  */
        /* JADX WARN: Code duplicated, block: B:41:0x00bd A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:42:0x00bf A[DONT_INVERT] */
        /* JADX WARN: Code duplicated, block: B:43:0x00c1  */
        /* JADX WARN: Code duplicated, block: B:45:0x00c4  */
        /* JADX WARN: Code duplicated, block: B:46:0x00c9  */
        /* JADX WARN: Code duplicated, block: B:48:0x00d4  */
        /* JADX WARN: Code duplicated, block: B:49:0x00d6  */
        /* JADX WARN: Code duplicated, block: B:52:0x00e0  */
        /* JADX WARN: Code duplicated, block: B:53:0x00e2  */
        /* JADX WARN: Code duplicated, block: B:59:0x00f1  */
        /* JADX WARN: Code duplicated, block: B:61:0x00f5 A[ADDED_TO_REGION] */
        /* JADX WARN: Code duplicated, block: B:65:0x0106  */
        /* JADX WARN: Code duplicated, block: B:66:0x0117  */
        /* JADX WARN: Code duplicated, block: B:67:0x0123  */
        /* JADX WARN: Code duplicated, block: B:70:0x0133  */
        /* JADX WARN: Code duplicated, block: B:71:0x0135  */
        /* JADX WARN: Code duplicated, block: B:73:0x0139  */
        /* JADX WARN: Code duplicated, block: B:74:0x013b  */
        /* JADX WARN: Code duplicated, block: B:77:0x0143  */
        /* JADX WARN: Code duplicated, block: B:81:0x014b  */
        /* JADX WARN: Code duplicated, block: B:83:0x014e  */
        /* JADX WARN: Code duplicated, block: B:87:0x0156  */
        /* JADX WARN: Code duplicated, block: B:90:0x015a  */
        /* JADX WARN: Code duplicated, block: B:93:0x0162  */
        /* JADX WARN: Code duplicated, block: B:95:0x0166  */
        /* JADX WARN: Code duplicated, block: B:98:0x0170  */
        @Override // V0.b.InterfaceC0191b
        public final void b(U0.e eVar, V0.b.a aVar) {
            int iMakeMeasureSpec;
            boolean z10;
            int i10;
            int iMakeMeasureSpec2;
            boolean z11;
            U0.e.b bVar;
            boolean z12;
            boolean z13;
            U0.e.b bVar2;
            boolean z14;
            boolean z15;
            boolean z16;
            boolean z17;
            b bVar3;
            int measuredWidth;
            int measuredHeight;
            int baseline;
            int i11;
            int measuredWidth2;
            int i12;
            int i13;
            int measuredHeight2;
            int i14;
            boolean z18;
            boolean z19;
            boolean z20;
            boolean z21;
            if (eVar == null) {
                return;
            }
            if (eVar.O() == 8 && !eVar.W()) {
                aVar.f13834e = 0;
                aVar.f13835f = 0;
                aVar.f13836g = 0;
                return;
            }
            U0.e.b bVar4 = aVar.f13830a;
            U0.e.b bVar5 = aVar.f13831b;
            int i15 = aVar.f13832c;
            int i16 = aVar.f13833d;
            int i17 = this.f22539b + this.f22540c;
            int i18 = this.f22541d;
            View view = (View) eVar.q();
            int[] iArr = a.f22469a;
            int i19 = iArr[bVar4.ordinal()];
            if (i19 != 1) {
                if (i19 == 2) {
                    iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f22543f, i18, -2);
                    eVar.f12715h[2] = -2;
                } else {
                    if (i19 != 3) {
                        if (i19 != 4) {
                            iMakeMeasureSpec = 0;
                            z10 = false;
                        } else {
                            iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f22543f, i18, -2);
                            boolean z22 = eVar.f12723l == 1;
                            int[] iArr2 = eVar.f12715h;
                            iArr2[2] = 0;
                            if (aVar.f13839j) {
                                boolean z23 = (!z22 || iArr2[3] == 0 || iArr2[0] == eVar.P()) ? false : true;
                                if (!z22 || z23) {
                                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(eVar.P(), 1073741824);
                                }
                            }
                        }
                        i10 = iArr[bVar5.ordinal()];
                        if (i10 != 1) {
                            if (i10 == 2) {
                                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f22544g, i17, -2);
                                eVar.f12715h[3] = -2;
                            } else {
                                if (i10 != 3) {
                                    if (i10 != 4) {
                                        iMakeMeasureSpec2 = 0;
                                        z11 = false;
                                    } else {
                                        iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f22544g, i17, -2);
                                        if (eVar.f12725m == 1) {
                                            z20 = true;
                                        } else {
                                            z20 = false;
                                        }
                                        int[] iArr3 = eVar.f12715h;
                                        iArr3[3] = 0;
                                        if (aVar.f13839j) {
                                            if (z20 || iArr3[2] == 0 || iArr3[1] == eVar.v()) {
                                                z21 = false;
                                            } else {
                                                z21 = true;
                                            }
                                            if (z20 || z21) {
                                                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(eVar.v(), 1073741824);
                                            }
                                        }
                                    }
                                    bVar = U0.e.b.MATCH_CONSTRAINT;
                                    if (bVar4 == bVar) {
                                        z12 = true;
                                    } else {
                                        z12 = false;
                                    }
                                    if (bVar5 == bVar) {
                                        z13 = true;
                                    } else {
                                        z13 = false;
                                    }
                                    bVar2 = U0.e.b.MATCH_PARENT;
                                    if (bVar5 != bVar2 || bVar5 == U0.e.b.FIXED) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    if (bVar4 != bVar2 || bVar4 == U0.e.b.FIXED) {
                                        z15 = true;
                                    } else {
                                        z15 = false;
                                    }
                                    if (z12 || eVar.f12691Q <= 0.0f) {
                                        z16 = false;
                                    } else {
                                        z16 = true;
                                    }
                                    if (z13 || eVar.f12691Q <= 0.0f) {
                                        z17 = false;
                                    } else {
                                        z17 = true;
                                    }
                                    bVar3 = (b) view.getLayoutParams();
                                    if (aVar.f13839j && z12 && eVar.f12723l == 0 && z13 && eVar.f12725m == 0) {
                                        measuredWidth2 = 0;
                                        measuredHeight2 = 0;
                                        baseline = 0;
                                    } else {
                                        if ((view instanceof j) || !(eVar instanceof l)) {
                                            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                        } else {
                                            ((j) view).n((l) eVar, iMakeMeasureSpec, iMakeMeasureSpec2);
                                        }
                                        measuredWidth = view.getMeasuredWidth();
                                        measuredHeight = view.getMeasuredHeight();
                                        baseline = view.getBaseline();
                                        if (z10) {
                                            int[] iArr4 = eVar.f12715h;
                                            iArr4[0] = measuredWidth;
                                            iArr4[2] = measuredHeight;
                                        } else {
                                            int[] iArr5 = eVar.f12715h;
                                            iArr5[0] = 0;
                                            iArr5[2] = 0;
                                        }
                                        if (z11) {
                                            int[] iArr6 = eVar.f12715h;
                                            iArr6[1] = measuredHeight;
                                            iArr6[3] = measuredWidth;
                                        } else {
                                            int[] iArr7 = eVar.f12715h;
                                            iArr7[1] = 0;
                                            iArr7[3] = 0;
                                        }
                                        i11 = eVar.f12729o;
                                        if (i11 > 0) {
                                            measuredWidth2 = Math.max(i11, measuredWidth);
                                        } else {
                                            measuredWidth2 = measuredWidth;
                                        }
                                        i12 = eVar.f12731p;
                                        if (i12 > 0) {
                                            measuredWidth2 = Math.min(i12, measuredWidth2);
                                        }
                                        i13 = eVar.f12735r;
                                        if (i13 > 0) {
                                            measuredHeight2 = Math.max(i13, measuredHeight);
                                        } else {
                                            measuredHeight2 = measuredHeight;
                                        }
                                        i14 = eVar.f12737s;
                                        if (i14 > 0) {
                                            measuredHeight2 = Math.min(i14, measuredHeight2);
                                        }
                                        if (!z16 && z14) {
                                            measuredWidth2 = (int) ((measuredHeight2 * eVar.f12691Q) + 0.5f);
                                        } else if (z17 && z15) {
                                            measuredHeight2 = (int) ((measuredWidth2 / eVar.f12691Q) + 0.5f);
                                        }
                                        if (measuredWidth == measuredWidth2 || measuredHeight != measuredHeight2) {
                                            if (measuredWidth != measuredWidth2) {
                                                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                                            }
                                            if (measuredHeight != measuredHeight2) {
                                                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                                            }
                                            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                            measuredWidth2 = view.getMeasuredWidth();
                                            measuredHeight2 = view.getMeasuredHeight();
                                            baseline = view.getBaseline();
                                        }
                                    }
                                    if (baseline != -1) {
                                        z18 = true;
                                    } else {
                                        z18 = false;
                                    }
                                    if (measuredWidth2 == aVar.f13832c || measuredHeight2 != aVar.f13833d) {
                                        z19 = true;
                                    } else {
                                        z19 = false;
                                    }
                                    aVar.f13838i = z19;
                                    if (bVar3.f22494Y) {
                                        z18 = true;
                                    }
                                    if (z18 && baseline != -1 && eVar.n() != baseline) {
                                        aVar.f13838i = true;
                                    }
                                    aVar.f13834e = measuredWidth2;
                                    aVar.f13835f = measuredHeight2;
                                    aVar.f13837h = z18;
                                    aVar.f13836g = baseline;
                                }
                                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f22544g, i17 + eVar.N(), -1);
                                eVar.f12715h[3] = -1;
                            }
                            z11 = true;
                            bVar = U0.e.b.MATCH_CONSTRAINT;
                            if (bVar4 == bVar) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (bVar5 == bVar) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            bVar2 = U0.e.b.MATCH_PARENT;
                            if (bVar5 != bVar2) {
                                z14 = true;
                            } else {
                                z14 = true;
                            }
                            if (bVar4 != bVar2) {
                                z15 = true;
                            } else {
                                z15 = true;
                            }
                            if (z12) {
                                z16 = false;
                            } else {
                                z16 = false;
                            }
                            if (z13) {
                                z17 = false;
                            } else {
                                z17 = false;
                            }
                            bVar3 = (b) view.getLayoutParams();
                            if (aVar.f13839j) {
                                if (view instanceof j) {
                                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                } else {
                                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                }
                                measuredWidth = view.getMeasuredWidth();
                                measuredHeight = view.getMeasuredHeight();
                                baseline = view.getBaseline();
                                if (z10) {
                                    int[] iArr8 = eVar.f12715h;
                                    iArr8[0] = measuredWidth;
                                    iArr8[2] = measuredHeight;
                                } else {
                                    int[] iArr9 = eVar.f12715h;
                                    iArr9[0] = 0;
                                    iArr9[2] = 0;
                                }
                                if (z11) {
                                    int[] iArr10 = eVar.f12715h;
                                    iArr10[1] = measuredHeight;
                                    iArr10[3] = measuredWidth;
                                } else {
                                    int[] iArr11 = eVar.f12715h;
                                    iArr11[1] = 0;
                                    iArr11[3] = 0;
                                }
                                i11 = eVar.f12729o;
                                if (i11 > 0) {
                                    measuredWidth2 = Math.max(i11, measuredWidth);
                                } else {
                                    measuredWidth2 = measuredWidth;
                                }
                                i12 = eVar.f12731p;
                                if (i12 > 0) {
                                    measuredWidth2 = Math.min(i12, measuredWidth2);
                                }
                                i13 = eVar.f12735r;
                                if (i13 > 0) {
                                    measuredHeight2 = Math.max(i13, measuredHeight);
                                } else {
                                    measuredHeight2 = measuredHeight;
                                }
                                i14 = eVar.f12737s;
                                if (i14 > 0) {
                                    measuredHeight2 = Math.min(i14, measuredHeight2);
                                }
                                if (!z16) {
                                    if (z17) {
                                        measuredHeight2 = (int) ((measuredWidth2 / eVar.f12691Q) + 0.5f);
                                    }
                                } else if (z17) {
                                    measuredHeight2 = (int) ((measuredWidth2 / eVar.f12691Q) + 0.5f);
                                }
                                if (measuredWidth == measuredWidth2) {
                                    if (measuredWidth != measuredWidth2) {
                                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                                    }
                                    if (measuredHeight != measuredHeight2) {
                                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                                    }
                                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                    measuredWidth2 = view.getMeasuredWidth();
                                    measuredHeight2 = view.getMeasuredHeight();
                                    baseline = view.getBaseline();
                                } else {
                                    if (measuredWidth != measuredWidth2) {
                                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                                    }
                                    if (measuredHeight != measuredHeight2) {
                                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                                    }
                                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                    measuredWidth2 = view.getMeasuredWidth();
                                    measuredHeight2 = view.getMeasuredHeight();
                                    baseline = view.getBaseline();
                                }
                            } else {
                                if (view instanceof j) {
                                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                } else {
                                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                }
                                measuredWidth = view.getMeasuredWidth();
                                measuredHeight = view.getMeasuredHeight();
                                baseline = view.getBaseline();
                                if (z10) {
                                    int[] iArr12 = eVar.f12715h;
                                    iArr12[0] = measuredWidth;
                                    iArr12[2] = measuredHeight;
                                } else {
                                    int[] iArr13 = eVar.f12715h;
                                    iArr13[0] = 0;
                                    iArr13[2] = 0;
                                }
                                if (z11) {
                                    int[] iArr14 = eVar.f12715h;
                                    iArr14[1] = measuredHeight;
                                    iArr14[3] = measuredWidth;
                                } else {
                                    int[] iArr15 = eVar.f12715h;
                                    iArr15[1] = 0;
                                    iArr15[3] = 0;
                                }
                                i11 = eVar.f12729o;
                                if (i11 > 0) {
                                    measuredWidth2 = Math.max(i11, measuredWidth);
                                } else {
                                    measuredWidth2 = measuredWidth;
                                }
                                i12 = eVar.f12731p;
                                if (i12 > 0) {
                                    measuredWidth2 = Math.min(i12, measuredWidth2);
                                }
                                i13 = eVar.f12735r;
                                if (i13 > 0) {
                                    measuredHeight2 = Math.max(i13, measuredHeight);
                                } else {
                                    measuredHeight2 = measuredHeight;
                                }
                                i14 = eVar.f12737s;
                                if (i14 > 0) {
                                    measuredHeight2 = Math.min(i14, measuredHeight2);
                                }
                                if (!z16) {
                                    if (z17) {
                                        measuredHeight2 = (int) ((measuredWidth2 / eVar.f12691Q) + 0.5f);
                                    }
                                } else if (z17) {
                                    measuredHeight2 = (int) ((measuredWidth2 / eVar.f12691Q) + 0.5f);
                                }
                                if (measuredWidth == measuredWidth2) {
                                    if (measuredWidth != measuredWidth2) {
                                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                                    }
                                    if (measuredHeight != measuredHeight2) {
                                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                                    }
                                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                    measuredWidth2 = view.getMeasuredWidth();
                                    measuredHeight2 = view.getMeasuredHeight();
                                    baseline = view.getBaseline();
                                } else {
                                    if (measuredWidth != measuredWidth2) {
                                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                                    }
                                    if (measuredHeight != measuredHeight2) {
                                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                                    }
                                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                    measuredWidth2 = view.getMeasuredWidth();
                                    measuredHeight2 = view.getMeasuredHeight();
                                    baseline = view.getBaseline();
                                }
                            }
                            if (baseline != -1) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            if (measuredWidth2 == aVar.f13832c) {
                                z19 = true;
                            } else {
                                z19 = true;
                            }
                            aVar.f13838i = z19;
                            if (bVar3.f22494Y) {
                                z18 = true;
                            }
                            if (z18) {
                                aVar.f13838i = true;
                            }
                            aVar.f13834e = measuredWidth2;
                            aVar.f13835f = measuredHeight2;
                            aVar.f13837h = z18;
                            aVar.f13836g = baseline;
                        }
                        int iMakeMeasureSpec3 = View.MeasureSpec.makeMeasureSpec(i16, 1073741824);
                        eVar.f12715h[3] = i16;
                        iMakeMeasureSpec2 = iMakeMeasureSpec3;
                        z11 = false;
                        bVar = U0.e.b.MATCH_CONSTRAINT;
                        if (bVar4 == bVar) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (bVar5 == bVar) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        bVar2 = U0.e.b.MATCH_PARENT;
                        if (bVar5 != bVar2) {
                            z14 = true;
                        } else {
                            z14 = true;
                        }
                        if (bVar4 != bVar2) {
                            z15 = true;
                        } else {
                            z15 = true;
                        }
                        if (z12) {
                            z16 = false;
                        } else {
                            z16 = false;
                        }
                        if (z13) {
                            z17 = false;
                        } else {
                            z17 = false;
                        }
                        bVar3 = (b) view.getLayoutParams();
                        if (aVar.f13839j) {
                            if (view instanceof j) {
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                            } else {
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                            }
                            measuredWidth = view.getMeasuredWidth();
                            measuredHeight = view.getMeasuredHeight();
                            baseline = view.getBaseline();
                            if (z10) {
                                int[] iArr16 = eVar.f12715h;
                                iArr16[0] = measuredWidth;
                                iArr16[2] = measuredHeight;
                            } else {
                                int[] iArr17 = eVar.f12715h;
                                iArr17[0] = 0;
                                iArr17[2] = 0;
                            }
                            if (z11) {
                                int[] iArr18 = eVar.f12715h;
                                iArr18[1] = measuredHeight;
                                iArr18[3] = measuredWidth;
                            } else {
                                int[] iArr19 = eVar.f12715h;
                                iArr19[1] = 0;
                                iArr19[3] = 0;
                            }
                            i11 = eVar.f12729o;
                            if (i11 > 0) {
                                measuredWidth2 = Math.max(i11, measuredWidth);
                            } else {
                                measuredWidth2 = measuredWidth;
                            }
                            i12 = eVar.f12731p;
                            if (i12 > 0) {
                                measuredWidth2 = Math.min(i12, measuredWidth2);
                            }
                            i13 = eVar.f12735r;
                            if (i13 > 0) {
                                measuredHeight2 = Math.max(i13, measuredHeight);
                            } else {
                                measuredHeight2 = measuredHeight;
                            }
                            i14 = eVar.f12737s;
                            if (i14 > 0) {
                                measuredHeight2 = Math.min(i14, measuredHeight2);
                            }
                            if (!z16) {
                                if (z17) {
                                    measuredHeight2 = (int) ((measuredWidth2 / eVar.f12691Q) + 0.5f);
                                }
                            } else if (z17) {
                                measuredHeight2 = (int) ((measuredWidth2 / eVar.f12691Q) + 0.5f);
                            }
                            if (measuredWidth == measuredWidth2) {
                                if (measuredWidth != measuredWidth2) {
                                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                                }
                                if (measuredHeight != measuredHeight2) {
                                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                                }
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                measuredWidth2 = view.getMeasuredWidth();
                                measuredHeight2 = view.getMeasuredHeight();
                                baseline = view.getBaseline();
                            } else {
                                if (measuredWidth != measuredWidth2) {
                                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                                }
                                if (measuredHeight != measuredHeight2) {
                                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                                }
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                measuredWidth2 = view.getMeasuredWidth();
                                measuredHeight2 = view.getMeasuredHeight();
                                baseline = view.getBaseline();
                            }
                        } else {
                            if (view instanceof j) {
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                            } else {
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                            }
                            measuredWidth = view.getMeasuredWidth();
                            measuredHeight = view.getMeasuredHeight();
                            baseline = view.getBaseline();
                            if (z10) {
                                int[] iArr110 = eVar.f12715h;
                                iArr110[0] = measuredWidth;
                                iArr110[2] = measuredHeight;
                            } else {
                                int[] iArr111 = eVar.f12715h;
                                iArr111[0] = 0;
                                iArr111[2] = 0;
                            }
                            if (z11) {
                                int[] iArr112 = eVar.f12715h;
                                iArr112[1] = measuredHeight;
                                iArr112[3] = measuredWidth;
                            } else {
                                int[] iArr113 = eVar.f12715h;
                                iArr113[1] = 0;
                                iArr113[3] = 0;
                            }
                            i11 = eVar.f12729o;
                            if (i11 > 0) {
                                measuredWidth2 = Math.max(i11, measuredWidth);
                            } else {
                                measuredWidth2 = measuredWidth;
                            }
                            i12 = eVar.f12731p;
                            if (i12 > 0) {
                                measuredWidth2 = Math.min(i12, measuredWidth2);
                            }
                            i13 = eVar.f12735r;
                            if (i13 > 0) {
                                measuredHeight2 = Math.max(i13, measuredHeight);
                            } else {
                                measuredHeight2 = measuredHeight;
                            }
                            i14 = eVar.f12737s;
                            if (i14 > 0) {
                                measuredHeight2 = Math.min(i14, measuredHeight2);
                            }
                            if (!z16) {
                                if (z17) {
                                    measuredHeight2 = (int) ((measuredWidth2 / eVar.f12691Q) + 0.5f);
                                }
                            } else if (z17) {
                                measuredHeight2 = (int) ((measuredWidth2 / eVar.f12691Q) + 0.5f);
                            }
                            if (measuredWidth == measuredWidth2) {
                                if (measuredWidth != measuredWidth2) {
                                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                                }
                                if (measuredHeight != measuredHeight2) {
                                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                                }
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                measuredWidth2 = view.getMeasuredWidth();
                                measuredHeight2 = view.getMeasuredHeight();
                                baseline = view.getBaseline();
                            } else {
                                if (measuredWidth != measuredWidth2) {
                                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                                }
                                if (measuredHeight != measuredHeight2) {
                                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                                }
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                measuredWidth2 = view.getMeasuredWidth();
                                measuredHeight2 = view.getMeasuredHeight();
                                baseline = view.getBaseline();
                            }
                        }
                        if (baseline != -1) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        if (measuredWidth2 == aVar.f13832c) {
                            z19 = true;
                        } else {
                            z19 = true;
                        }
                        aVar.f13838i = z19;
                        if (bVar3.f22494Y) {
                            z18 = true;
                        }
                        if (z18) {
                            aVar.f13838i = true;
                        }
                        aVar.f13834e = measuredWidth2;
                        aVar.f13835f = measuredHeight2;
                        aVar.f13837h = z18;
                        aVar.f13836g = baseline;
                    }
                    iMakeMeasureSpec = ViewGroup.getChildMeasureSpec(this.f22543f, i18 + eVar.z(), -1);
                    eVar.f12715h[2] = -1;
                }
                z10 = true;
                i10 = iArr[bVar5.ordinal()];
                if (i10 != 1) {
                    if (i10 == 2) {
                        iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f22544g, i17, -2);
                        eVar.f12715h[3] = -2;
                    } else {
                        if (i10 != 3) {
                            if (i10 != 4) {
                                iMakeMeasureSpec2 = 0;
                                z11 = false;
                            } else {
                                iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f22544g, i17, -2);
                                if (eVar.f12725m == 1) {
                                    z20 = true;
                                } else {
                                    z20 = false;
                                }
                                int[] iArr20 = eVar.f12715h;
                                iArr20[3] = 0;
                                if (aVar.f13839j) {
                                    if (z20) {
                                        z21 = false;
                                    } else {
                                        z21 = false;
                                    }
                                    if (z20) {
                                    }
                                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(eVar.v(), 1073741824);
                                }
                            }
                            bVar = U0.e.b.MATCH_CONSTRAINT;
                            if (bVar4 == bVar) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (bVar5 == bVar) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            bVar2 = U0.e.b.MATCH_PARENT;
                            if (bVar5 != bVar2) {
                                z14 = true;
                            } else {
                                z14 = true;
                            }
                            if (bVar4 != bVar2) {
                                z15 = true;
                            } else {
                                z15 = true;
                            }
                            if (z12) {
                                z16 = false;
                            } else {
                                z16 = false;
                            }
                            if (z13) {
                                z17 = false;
                            } else {
                                z17 = false;
                            }
                            bVar3 = (b) view.getLayoutParams();
                            if (aVar.f13839j) {
                                if (view instanceof j) {
                                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                } else {
                                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                }
                                measuredWidth = view.getMeasuredWidth();
                                measuredHeight = view.getMeasuredHeight();
                                baseline = view.getBaseline();
                                if (z10) {
                                    int[] iArr114 = eVar.f12715h;
                                    iArr114[0] = measuredWidth;
                                    iArr114[2] = measuredHeight;
                                } else {
                                    int[] iArr115 = eVar.f12715h;
                                    iArr115[0] = 0;
                                    iArr115[2] = 0;
                                }
                                if (z11) {
                                    int[] iArr116 = eVar.f12715h;
                                    iArr116[1] = measuredHeight;
                                    iArr116[3] = measuredWidth;
                                } else {
                                    int[] iArr117 = eVar.f12715h;
                                    iArr117[1] = 0;
                                    iArr117[3] = 0;
                                }
                                i11 = eVar.f12729o;
                                if (i11 > 0) {
                                    measuredWidth2 = Math.max(i11, measuredWidth);
                                } else {
                                    measuredWidth2 = measuredWidth;
                                }
                                i12 = eVar.f12731p;
                                if (i12 > 0) {
                                    measuredWidth2 = Math.min(i12, measuredWidth2);
                                }
                                i13 = eVar.f12735r;
                                if (i13 > 0) {
                                    measuredHeight2 = Math.max(i13, measuredHeight);
                                } else {
                                    measuredHeight2 = measuredHeight;
                                }
                                i14 = eVar.f12737s;
                                if (i14 > 0) {
                                    measuredHeight2 = Math.min(i14, measuredHeight2);
                                }
                                if (!z16) {
                                    if (z17) {
                                        measuredHeight2 = (int) ((measuredWidth2 / eVar.f12691Q) + 0.5f);
                                    }
                                } else if (z17) {
                                    measuredHeight2 = (int) ((measuredWidth2 / eVar.f12691Q) + 0.5f);
                                }
                                if (measuredWidth == measuredWidth2) {
                                    if (measuredWidth != measuredWidth2) {
                                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                                    }
                                    if (measuredHeight != measuredHeight2) {
                                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                                    }
                                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                    measuredWidth2 = view.getMeasuredWidth();
                                    measuredHeight2 = view.getMeasuredHeight();
                                    baseline = view.getBaseline();
                                } else {
                                    if (measuredWidth != measuredWidth2) {
                                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                                    }
                                    if (measuredHeight != measuredHeight2) {
                                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                                    }
                                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                    measuredWidth2 = view.getMeasuredWidth();
                                    measuredHeight2 = view.getMeasuredHeight();
                                    baseline = view.getBaseline();
                                }
                            } else {
                                if (view instanceof j) {
                                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                } else {
                                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                }
                                measuredWidth = view.getMeasuredWidth();
                                measuredHeight = view.getMeasuredHeight();
                                baseline = view.getBaseline();
                                if (z10) {
                                    int[] iArr118 = eVar.f12715h;
                                    iArr118[0] = measuredWidth;
                                    iArr118[2] = measuredHeight;
                                } else {
                                    int[] iArr119 = eVar.f12715h;
                                    iArr119[0] = 0;
                                    iArr119[2] = 0;
                                }
                                if (z11) {
                                    int[] iArr1110 = eVar.f12715h;
                                    iArr1110[1] = measuredHeight;
                                    iArr1110[3] = measuredWidth;
                                } else {
                                    int[] iArr1111 = eVar.f12715h;
                                    iArr1111[1] = 0;
                                    iArr1111[3] = 0;
                                }
                                i11 = eVar.f12729o;
                                if (i11 > 0) {
                                    measuredWidth2 = Math.max(i11, measuredWidth);
                                } else {
                                    measuredWidth2 = measuredWidth;
                                }
                                i12 = eVar.f12731p;
                                if (i12 > 0) {
                                    measuredWidth2 = Math.min(i12, measuredWidth2);
                                }
                                i13 = eVar.f12735r;
                                if (i13 > 0) {
                                    measuredHeight2 = Math.max(i13, measuredHeight);
                                } else {
                                    measuredHeight2 = measuredHeight;
                                }
                                i14 = eVar.f12737s;
                                if (i14 > 0) {
                                    measuredHeight2 = Math.min(i14, measuredHeight2);
                                }
                                if (!z16) {
                                    if (z17) {
                                        measuredHeight2 = (int) ((measuredWidth2 / eVar.f12691Q) + 0.5f);
                                    }
                                } else if (z17) {
                                    measuredHeight2 = (int) ((measuredWidth2 / eVar.f12691Q) + 0.5f);
                                }
                                if (measuredWidth == measuredWidth2) {
                                    if (measuredWidth != measuredWidth2) {
                                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                                    }
                                    if (measuredHeight != measuredHeight2) {
                                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                                    }
                                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                    measuredWidth2 = view.getMeasuredWidth();
                                    measuredHeight2 = view.getMeasuredHeight();
                                    baseline = view.getBaseline();
                                } else {
                                    if (measuredWidth != measuredWidth2) {
                                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                                    }
                                    if (measuredHeight != measuredHeight2) {
                                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                                    }
                                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                    measuredWidth2 = view.getMeasuredWidth();
                                    measuredHeight2 = view.getMeasuredHeight();
                                    baseline = view.getBaseline();
                                }
                            }
                            if (baseline != -1) {
                                z18 = true;
                            } else {
                                z18 = false;
                            }
                            if (measuredWidth2 == aVar.f13832c) {
                                z19 = true;
                            } else {
                                z19 = true;
                            }
                            aVar.f13838i = z19;
                            if (bVar3.f22494Y) {
                                z18 = true;
                            }
                            if (z18) {
                                aVar.f13838i = true;
                            }
                            aVar.f13834e = measuredWidth2;
                            aVar.f13835f = measuredHeight2;
                            aVar.f13837h = z18;
                            aVar.f13836g = baseline;
                        }
                        iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f22544g, i17 + eVar.N(), -1);
                        eVar.f12715h[3] = -1;
                    }
                    z11 = true;
                    bVar = U0.e.b.MATCH_CONSTRAINT;
                    if (bVar4 == bVar) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (bVar5 == bVar) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    bVar2 = U0.e.b.MATCH_PARENT;
                    if (bVar5 != bVar2) {
                        z14 = true;
                    } else {
                        z14 = true;
                    }
                    if (bVar4 != bVar2) {
                        z15 = true;
                    } else {
                        z15 = true;
                    }
                    if (z12) {
                        z16 = false;
                    } else {
                        z16 = false;
                    }
                    if (z13) {
                        z17 = false;
                    } else {
                        z17 = false;
                    }
                    bVar3 = (b) view.getLayoutParams();
                    if (aVar.f13839j) {
                        if (view instanceof j) {
                            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        } else {
                            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        }
                        measuredWidth = view.getMeasuredWidth();
                        measuredHeight = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                        if (z10) {
                            int[] iArr1112 = eVar.f12715h;
                            iArr1112[0] = measuredWidth;
                            iArr1112[2] = measuredHeight;
                        } else {
                            int[] iArr1113 = eVar.f12715h;
                            iArr1113[0] = 0;
                            iArr1113[2] = 0;
                        }
                        if (z11) {
                            int[] iArr1114 = eVar.f12715h;
                            iArr1114[1] = measuredHeight;
                            iArr1114[3] = measuredWidth;
                        } else {
                            int[] iArr1115 = eVar.f12715h;
                            iArr1115[1] = 0;
                            iArr1115[3] = 0;
                        }
                        i11 = eVar.f12729o;
                        if (i11 > 0) {
                            measuredWidth2 = Math.max(i11, measuredWidth);
                        } else {
                            measuredWidth2 = measuredWidth;
                        }
                        i12 = eVar.f12731p;
                        if (i12 > 0) {
                            measuredWidth2 = Math.min(i12, measuredWidth2);
                        }
                        i13 = eVar.f12735r;
                        if (i13 > 0) {
                            measuredHeight2 = Math.max(i13, measuredHeight);
                        } else {
                            measuredHeight2 = measuredHeight;
                        }
                        i14 = eVar.f12737s;
                        if (i14 > 0) {
                            measuredHeight2 = Math.min(i14, measuredHeight2);
                        }
                        if (!z16) {
                            if (z17) {
                                measuredHeight2 = (int) ((measuredWidth2 / eVar.f12691Q) + 0.5f);
                            }
                        } else if (z17) {
                            measuredHeight2 = (int) ((measuredWidth2 / eVar.f12691Q) + 0.5f);
                        }
                        if (measuredWidth == measuredWidth2) {
                            if (measuredWidth != measuredWidth2) {
                                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                            }
                            if (measuredHeight != measuredHeight2) {
                                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                            }
                            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                            measuredWidth2 = view.getMeasuredWidth();
                            measuredHeight2 = view.getMeasuredHeight();
                            baseline = view.getBaseline();
                        } else {
                            if (measuredWidth != measuredWidth2) {
                                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                            }
                            if (measuredHeight != measuredHeight2) {
                                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                            }
                            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                            measuredWidth2 = view.getMeasuredWidth();
                            measuredHeight2 = view.getMeasuredHeight();
                            baseline = view.getBaseline();
                        }
                    } else {
                        if (view instanceof j) {
                            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        } else {
                            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        }
                        measuredWidth = view.getMeasuredWidth();
                        measuredHeight = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                        if (z10) {
                            int[] iArr1116 = eVar.f12715h;
                            iArr1116[0] = measuredWidth;
                            iArr1116[2] = measuredHeight;
                        } else {
                            int[] iArr1117 = eVar.f12715h;
                            iArr1117[0] = 0;
                            iArr1117[2] = 0;
                        }
                        if (z11) {
                            int[] iArr1118 = eVar.f12715h;
                            iArr1118[1] = measuredHeight;
                            iArr1118[3] = measuredWidth;
                        } else {
                            int[] iArr1119 = eVar.f12715h;
                            iArr1119[1] = 0;
                            iArr1119[3] = 0;
                        }
                        i11 = eVar.f12729o;
                        if (i11 > 0) {
                            measuredWidth2 = Math.max(i11, measuredWidth);
                        } else {
                            measuredWidth2 = measuredWidth;
                        }
                        i12 = eVar.f12731p;
                        if (i12 > 0) {
                            measuredWidth2 = Math.min(i12, measuredWidth2);
                        }
                        i13 = eVar.f12735r;
                        if (i13 > 0) {
                            measuredHeight2 = Math.max(i13, measuredHeight);
                        } else {
                            measuredHeight2 = measuredHeight;
                        }
                        i14 = eVar.f12737s;
                        if (i14 > 0) {
                            measuredHeight2 = Math.min(i14, measuredHeight2);
                        }
                        if (!z16) {
                            if (z17) {
                                measuredHeight2 = (int) ((measuredWidth2 / eVar.f12691Q) + 0.5f);
                            }
                        } else if (z17) {
                            measuredHeight2 = (int) ((measuredWidth2 / eVar.f12691Q) + 0.5f);
                        }
                        if (measuredWidth == measuredWidth2) {
                            if (measuredWidth != measuredWidth2) {
                                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                            }
                            if (measuredHeight != measuredHeight2) {
                                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                            }
                            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                            measuredWidth2 = view.getMeasuredWidth();
                            measuredHeight2 = view.getMeasuredHeight();
                            baseline = view.getBaseline();
                        } else {
                            if (measuredWidth != measuredWidth2) {
                                iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                            }
                            if (measuredHeight != measuredHeight2) {
                                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                            }
                            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                            measuredWidth2 = view.getMeasuredWidth();
                            measuredHeight2 = view.getMeasuredHeight();
                            baseline = view.getBaseline();
                        }
                    }
                    if (baseline != -1) {
                        z18 = true;
                    } else {
                        z18 = false;
                    }
                    if (measuredWidth2 == aVar.f13832c) {
                        z19 = true;
                    } else {
                        z19 = true;
                    }
                    aVar.f13838i = z19;
                    if (bVar3.f22494Y) {
                        z18 = true;
                    }
                    if (z18) {
                        aVar.f13838i = true;
                    }
                    aVar.f13834e = measuredWidth2;
                    aVar.f13835f = measuredHeight2;
                    aVar.f13837h = z18;
                    aVar.f13836g = baseline;
                }
                int iMakeMeasureSpec4 = View.MeasureSpec.makeMeasureSpec(i16, 1073741824);
                eVar.f12715h[3] = i16;
                iMakeMeasureSpec2 = iMakeMeasureSpec4;
                z11 = false;
                bVar = U0.e.b.MATCH_CONSTRAINT;
                if (bVar4 == bVar) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (bVar5 == bVar) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                bVar2 = U0.e.b.MATCH_PARENT;
                if (bVar5 != bVar2) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                if (bVar4 != bVar2) {
                    z15 = true;
                } else {
                    z15 = true;
                }
                if (z12) {
                    z16 = false;
                } else {
                    z16 = false;
                }
                if (z13) {
                    z17 = false;
                } else {
                    z17 = false;
                }
                bVar3 = (b) view.getLayoutParams();
                if (aVar.f13839j) {
                    if (view instanceof j) {
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    } else {
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    }
                    measuredWidth = view.getMeasuredWidth();
                    measuredHeight = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                    if (z10) {
                        int[] iArr11110 = eVar.f12715h;
                        iArr11110[0] = measuredWidth;
                        iArr11110[2] = measuredHeight;
                    } else {
                        int[] iArr11111 = eVar.f12715h;
                        iArr11111[0] = 0;
                        iArr11111[2] = 0;
                    }
                    if (z11) {
                        int[] iArr11112 = eVar.f12715h;
                        iArr11112[1] = measuredHeight;
                        iArr11112[3] = measuredWidth;
                    } else {
                        int[] iArr11113 = eVar.f12715h;
                        iArr11113[1] = 0;
                        iArr11113[3] = 0;
                    }
                    i11 = eVar.f12729o;
                    if (i11 > 0) {
                        measuredWidth2 = Math.max(i11, measuredWidth);
                    } else {
                        measuredWidth2 = measuredWidth;
                    }
                    i12 = eVar.f12731p;
                    if (i12 > 0) {
                        measuredWidth2 = Math.min(i12, measuredWidth2);
                    }
                    i13 = eVar.f12735r;
                    if (i13 > 0) {
                        measuredHeight2 = Math.max(i13, measuredHeight);
                    } else {
                        measuredHeight2 = measuredHeight;
                    }
                    i14 = eVar.f12737s;
                    if (i14 > 0) {
                        measuredHeight2 = Math.min(i14, measuredHeight2);
                    }
                    if (!z16) {
                        if (z17) {
                            measuredHeight2 = (int) ((measuredWidth2 / eVar.f12691Q) + 0.5f);
                        }
                    } else if (z17) {
                        measuredHeight2 = (int) ((measuredWidth2 / eVar.f12691Q) + 0.5f);
                    }
                    if (measuredWidth == measuredWidth2) {
                        if (measuredWidth != measuredWidth2) {
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                        }
                        if (measuredHeight != measuredHeight2) {
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                        }
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        measuredWidth2 = view.getMeasuredWidth();
                        measuredHeight2 = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                    } else {
                        if (measuredWidth != measuredWidth2) {
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                        }
                        if (measuredHeight != measuredHeight2) {
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                        }
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        measuredWidth2 = view.getMeasuredWidth();
                        measuredHeight2 = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                    }
                } else {
                    if (view instanceof j) {
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    } else {
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    }
                    measuredWidth = view.getMeasuredWidth();
                    measuredHeight = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                    if (z10) {
                        int[] iArr11114 = eVar.f12715h;
                        iArr11114[0] = measuredWidth;
                        iArr11114[2] = measuredHeight;
                    } else {
                        int[] iArr11115 = eVar.f12715h;
                        iArr11115[0] = 0;
                        iArr11115[2] = 0;
                    }
                    if (z11) {
                        int[] iArr11116 = eVar.f12715h;
                        iArr11116[1] = measuredHeight;
                        iArr11116[3] = measuredWidth;
                    } else {
                        int[] iArr11117 = eVar.f12715h;
                        iArr11117[1] = 0;
                        iArr11117[3] = 0;
                    }
                    i11 = eVar.f12729o;
                    if (i11 > 0) {
                        measuredWidth2 = Math.max(i11, measuredWidth);
                    } else {
                        measuredWidth2 = measuredWidth;
                    }
                    i12 = eVar.f12731p;
                    if (i12 > 0) {
                        measuredWidth2 = Math.min(i12, measuredWidth2);
                    }
                    i13 = eVar.f12735r;
                    if (i13 > 0) {
                        measuredHeight2 = Math.max(i13, measuredHeight);
                    } else {
                        measuredHeight2 = measuredHeight;
                    }
                    i14 = eVar.f12737s;
                    if (i14 > 0) {
                        measuredHeight2 = Math.min(i14, measuredHeight2);
                    }
                    if (!z16) {
                        if (z17) {
                            measuredHeight2 = (int) ((measuredWidth2 / eVar.f12691Q) + 0.5f);
                        }
                    } else if (z17) {
                        measuredHeight2 = (int) ((measuredWidth2 / eVar.f12691Q) + 0.5f);
                    }
                    if (measuredWidth == measuredWidth2) {
                        if (measuredWidth != measuredWidth2) {
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                        }
                        if (measuredHeight != measuredHeight2) {
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                        }
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        measuredWidth2 = view.getMeasuredWidth();
                        measuredHeight2 = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                    } else {
                        if (measuredWidth != measuredWidth2) {
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                        }
                        if (measuredHeight != measuredHeight2) {
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                        }
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        measuredWidth2 = view.getMeasuredWidth();
                        measuredHeight2 = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                    }
                }
                if (baseline != -1) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (measuredWidth2 == aVar.f13832c) {
                    z19 = true;
                } else {
                    z19 = true;
                }
                aVar.f13838i = z19;
                if (bVar3.f22494Y) {
                    z18 = true;
                }
                if (z18) {
                    aVar.f13838i = true;
                }
                aVar.f13834e = measuredWidth2;
                aVar.f13835f = measuredHeight2;
                aVar.f13837h = z18;
                aVar.f13836g = baseline;
            }
            int iMakeMeasureSpec5 = View.MeasureSpec.makeMeasureSpec(i15, 1073741824);
            eVar.f12715h[2] = i15;
            iMakeMeasureSpec = iMakeMeasureSpec5;
            z10 = false;
            i10 = iArr[bVar5.ordinal()];
            if (i10 != 1) {
                if (i10 == 2) {
                    iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f22544g, i17, -2);
                    eVar.f12715h[3] = -2;
                } else {
                    if (i10 != 3) {
                        if (i10 != 4) {
                            iMakeMeasureSpec2 = 0;
                            z11 = false;
                        } else {
                            iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f22544g, i17, -2);
                            if (eVar.f12725m == 1) {
                                z20 = true;
                            } else {
                                z20 = false;
                            }
                            int[] iArr21 = eVar.f12715h;
                            iArr21[3] = 0;
                            if (aVar.f13839j) {
                                if (z20) {
                                    z21 = false;
                                } else {
                                    z21 = false;
                                }
                                if (z20) {
                                }
                                iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(eVar.v(), 1073741824);
                            }
                        }
                        bVar = U0.e.b.MATCH_CONSTRAINT;
                        if (bVar4 == bVar) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (bVar5 == bVar) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        bVar2 = U0.e.b.MATCH_PARENT;
                        if (bVar5 != bVar2) {
                            z14 = true;
                        } else {
                            z14 = true;
                        }
                        if (bVar4 != bVar2) {
                            z15 = true;
                        } else {
                            z15 = true;
                        }
                        if (z12) {
                            z16 = false;
                        } else {
                            z16 = false;
                        }
                        if (z13) {
                            z17 = false;
                        } else {
                            z17 = false;
                        }
                        bVar3 = (b) view.getLayoutParams();
                        if (aVar.f13839j) {
                            if (view instanceof j) {
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                            } else {
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                            }
                            measuredWidth = view.getMeasuredWidth();
                            measuredHeight = view.getMeasuredHeight();
                            baseline = view.getBaseline();
                            if (z10) {
                                int[] iArr11118 = eVar.f12715h;
                                iArr11118[0] = measuredWidth;
                                iArr11118[2] = measuredHeight;
                            } else {
                                int[] iArr11119 = eVar.f12715h;
                                iArr11119[0] = 0;
                                iArr11119[2] = 0;
                            }
                            if (z11) {
                                int[] iArr111110 = eVar.f12715h;
                                iArr111110[1] = measuredHeight;
                                iArr111110[3] = measuredWidth;
                            } else {
                                int[] iArr111111 = eVar.f12715h;
                                iArr111111[1] = 0;
                                iArr111111[3] = 0;
                            }
                            i11 = eVar.f12729o;
                            if (i11 > 0) {
                                measuredWidth2 = Math.max(i11, measuredWidth);
                            } else {
                                measuredWidth2 = measuredWidth;
                            }
                            i12 = eVar.f12731p;
                            if (i12 > 0) {
                                measuredWidth2 = Math.min(i12, measuredWidth2);
                            }
                            i13 = eVar.f12735r;
                            if (i13 > 0) {
                                measuredHeight2 = Math.max(i13, measuredHeight);
                            } else {
                                measuredHeight2 = measuredHeight;
                            }
                            i14 = eVar.f12737s;
                            if (i14 > 0) {
                                measuredHeight2 = Math.min(i14, measuredHeight2);
                            }
                            if (!z16) {
                                if (z17) {
                                    measuredHeight2 = (int) ((measuredWidth2 / eVar.f12691Q) + 0.5f);
                                }
                            } else if (z17) {
                                measuredHeight2 = (int) ((measuredWidth2 / eVar.f12691Q) + 0.5f);
                            }
                            if (measuredWidth == measuredWidth2) {
                                if (measuredWidth != measuredWidth2) {
                                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                                }
                                if (measuredHeight != measuredHeight2) {
                                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                                }
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                measuredWidth2 = view.getMeasuredWidth();
                                measuredHeight2 = view.getMeasuredHeight();
                                baseline = view.getBaseline();
                            } else {
                                if (measuredWidth != measuredWidth2) {
                                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                                }
                                if (measuredHeight != measuredHeight2) {
                                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                                }
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                measuredWidth2 = view.getMeasuredWidth();
                                measuredHeight2 = view.getMeasuredHeight();
                                baseline = view.getBaseline();
                            }
                        } else {
                            if (view instanceof j) {
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                            } else {
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                            }
                            measuredWidth = view.getMeasuredWidth();
                            measuredHeight = view.getMeasuredHeight();
                            baseline = view.getBaseline();
                            if (z10) {
                                int[] iArr111112 = eVar.f12715h;
                                iArr111112[0] = measuredWidth;
                                iArr111112[2] = measuredHeight;
                            } else {
                                int[] iArr111113 = eVar.f12715h;
                                iArr111113[0] = 0;
                                iArr111113[2] = 0;
                            }
                            if (z11) {
                                int[] iArr111114 = eVar.f12715h;
                                iArr111114[1] = measuredHeight;
                                iArr111114[3] = measuredWidth;
                            } else {
                                int[] iArr111115 = eVar.f12715h;
                                iArr111115[1] = 0;
                                iArr111115[3] = 0;
                            }
                            i11 = eVar.f12729o;
                            if (i11 > 0) {
                                measuredWidth2 = Math.max(i11, measuredWidth);
                            } else {
                                measuredWidth2 = measuredWidth;
                            }
                            i12 = eVar.f12731p;
                            if (i12 > 0) {
                                measuredWidth2 = Math.min(i12, measuredWidth2);
                            }
                            i13 = eVar.f12735r;
                            if (i13 > 0) {
                                measuredHeight2 = Math.max(i13, measuredHeight);
                            } else {
                                measuredHeight2 = measuredHeight;
                            }
                            i14 = eVar.f12737s;
                            if (i14 > 0) {
                                measuredHeight2 = Math.min(i14, measuredHeight2);
                            }
                            if (!z16) {
                                if (z17) {
                                    measuredHeight2 = (int) ((measuredWidth2 / eVar.f12691Q) + 0.5f);
                                }
                            } else if (z17) {
                                measuredHeight2 = (int) ((measuredWidth2 / eVar.f12691Q) + 0.5f);
                            }
                            if (measuredWidth == measuredWidth2) {
                                if (measuredWidth != measuredWidth2) {
                                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                                }
                                if (measuredHeight != measuredHeight2) {
                                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                                }
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                measuredWidth2 = view.getMeasuredWidth();
                                measuredHeight2 = view.getMeasuredHeight();
                                baseline = view.getBaseline();
                            } else {
                                if (measuredWidth != measuredWidth2) {
                                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                                }
                                if (measuredHeight != measuredHeight2) {
                                    iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                                }
                                view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                                measuredWidth2 = view.getMeasuredWidth();
                                measuredHeight2 = view.getMeasuredHeight();
                                baseline = view.getBaseline();
                            }
                        }
                        if (baseline != -1) {
                            z18 = true;
                        } else {
                            z18 = false;
                        }
                        if (measuredWidth2 == aVar.f13832c) {
                            z19 = true;
                        } else {
                            z19 = true;
                        }
                        aVar.f13838i = z19;
                        if (bVar3.f22494Y) {
                            z18 = true;
                        }
                        if (z18) {
                            aVar.f13838i = true;
                        }
                        aVar.f13834e = measuredWidth2;
                        aVar.f13835f = measuredHeight2;
                        aVar.f13837h = z18;
                        aVar.f13836g = baseline;
                    }
                    iMakeMeasureSpec2 = ViewGroup.getChildMeasureSpec(this.f22544g, i17 + eVar.N(), -1);
                    eVar.f12715h[3] = -1;
                }
                z11 = true;
                bVar = U0.e.b.MATCH_CONSTRAINT;
                if (bVar4 == bVar) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (bVar5 == bVar) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                bVar2 = U0.e.b.MATCH_PARENT;
                if (bVar5 != bVar2) {
                    z14 = true;
                } else {
                    z14 = true;
                }
                if (bVar4 != bVar2) {
                    z15 = true;
                } else {
                    z15 = true;
                }
                if (z12) {
                    z16 = false;
                } else {
                    z16 = false;
                }
                if (z13) {
                    z17 = false;
                } else {
                    z17 = false;
                }
                bVar3 = (b) view.getLayoutParams();
                if (aVar.f13839j) {
                    if (view instanceof j) {
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    } else {
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    }
                    measuredWidth = view.getMeasuredWidth();
                    measuredHeight = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                    if (z10) {
                        int[] iArr111116 = eVar.f12715h;
                        iArr111116[0] = measuredWidth;
                        iArr111116[2] = measuredHeight;
                    } else {
                        int[] iArr111117 = eVar.f12715h;
                        iArr111117[0] = 0;
                        iArr111117[2] = 0;
                    }
                    if (z11) {
                        int[] iArr111118 = eVar.f12715h;
                        iArr111118[1] = measuredHeight;
                        iArr111118[3] = measuredWidth;
                    } else {
                        int[] iArr111119 = eVar.f12715h;
                        iArr111119[1] = 0;
                        iArr111119[3] = 0;
                    }
                    i11 = eVar.f12729o;
                    if (i11 > 0) {
                        measuredWidth2 = Math.max(i11, measuredWidth);
                    } else {
                        measuredWidth2 = measuredWidth;
                    }
                    i12 = eVar.f12731p;
                    if (i12 > 0) {
                        measuredWidth2 = Math.min(i12, measuredWidth2);
                    }
                    i13 = eVar.f12735r;
                    if (i13 > 0) {
                        measuredHeight2 = Math.max(i13, measuredHeight);
                    } else {
                        measuredHeight2 = measuredHeight;
                    }
                    i14 = eVar.f12737s;
                    if (i14 > 0) {
                        measuredHeight2 = Math.min(i14, measuredHeight2);
                    }
                    if (!z16) {
                        if (z17) {
                            measuredHeight2 = (int) ((measuredWidth2 / eVar.f12691Q) + 0.5f);
                        }
                    } else if (z17) {
                        measuredHeight2 = (int) ((measuredWidth2 / eVar.f12691Q) + 0.5f);
                    }
                    if (measuredWidth == measuredWidth2) {
                        if (measuredWidth != measuredWidth2) {
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                        }
                        if (measuredHeight != measuredHeight2) {
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                        }
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        measuredWidth2 = view.getMeasuredWidth();
                        measuredHeight2 = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                    } else {
                        if (measuredWidth != measuredWidth2) {
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                        }
                        if (measuredHeight != measuredHeight2) {
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                        }
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        measuredWidth2 = view.getMeasuredWidth();
                        measuredHeight2 = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                    }
                } else {
                    if (view instanceof j) {
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    } else {
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    }
                    measuredWidth = view.getMeasuredWidth();
                    measuredHeight = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                    if (z10) {
                        int[] iArr1111110 = eVar.f12715h;
                        iArr1111110[0] = measuredWidth;
                        iArr1111110[2] = measuredHeight;
                    } else {
                        int[] iArr1111111 = eVar.f12715h;
                        iArr1111111[0] = 0;
                        iArr1111111[2] = 0;
                    }
                    if (z11) {
                        int[] iArr1111112 = eVar.f12715h;
                        iArr1111112[1] = measuredHeight;
                        iArr1111112[3] = measuredWidth;
                    } else {
                        int[] iArr1111113 = eVar.f12715h;
                        iArr1111113[1] = 0;
                        iArr1111113[3] = 0;
                    }
                    i11 = eVar.f12729o;
                    if (i11 > 0) {
                        measuredWidth2 = Math.max(i11, measuredWidth);
                    } else {
                        measuredWidth2 = measuredWidth;
                    }
                    i12 = eVar.f12731p;
                    if (i12 > 0) {
                        measuredWidth2 = Math.min(i12, measuredWidth2);
                    }
                    i13 = eVar.f12735r;
                    if (i13 > 0) {
                        measuredHeight2 = Math.max(i13, measuredHeight);
                    } else {
                        measuredHeight2 = measuredHeight;
                    }
                    i14 = eVar.f12737s;
                    if (i14 > 0) {
                        measuredHeight2 = Math.min(i14, measuredHeight2);
                    }
                    if (!z16) {
                        if (z17) {
                            measuredHeight2 = (int) ((measuredWidth2 / eVar.f12691Q) + 0.5f);
                        }
                    } else if (z17) {
                        measuredHeight2 = (int) ((measuredWidth2 / eVar.f12691Q) + 0.5f);
                    }
                    if (measuredWidth == measuredWidth2) {
                        if (measuredWidth != measuredWidth2) {
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                        }
                        if (measuredHeight != measuredHeight2) {
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                        }
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        measuredWidth2 = view.getMeasuredWidth();
                        measuredHeight2 = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                    } else {
                        if (measuredWidth != measuredWidth2) {
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                        }
                        if (measuredHeight != measuredHeight2) {
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                        }
                        view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                        measuredWidth2 = view.getMeasuredWidth();
                        measuredHeight2 = view.getMeasuredHeight();
                        baseline = view.getBaseline();
                    }
                }
                if (baseline != -1) {
                    z18 = true;
                } else {
                    z18 = false;
                }
                if (measuredWidth2 == aVar.f13832c) {
                    z19 = true;
                } else {
                    z19 = true;
                }
                aVar.f13838i = z19;
                if (bVar3.f22494Y) {
                    z18 = true;
                }
                if (z18) {
                    aVar.f13838i = true;
                }
                aVar.f13834e = measuredWidth2;
                aVar.f13835f = measuredHeight2;
                aVar.f13837h = z18;
                aVar.f13836g = baseline;
            }
            int iMakeMeasureSpec6 = View.MeasureSpec.makeMeasureSpec(i16, 1073741824);
            eVar.f12715h[3] = i16;
            iMakeMeasureSpec2 = iMakeMeasureSpec6;
            z11 = false;
            bVar = U0.e.b.MATCH_CONSTRAINT;
            if (bVar4 == bVar) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (bVar5 == bVar) {
                z13 = true;
            } else {
                z13 = false;
            }
            bVar2 = U0.e.b.MATCH_PARENT;
            if (bVar5 != bVar2) {
                z14 = true;
            } else {
                z14 = true;
            }
            if (bVar4 != bVar2) {
                z15 = true;
            } else {
                z15 = true;
            }
            if (z12) {
                z16 = false;
            } else {
                z16 = false;
            }
            if (z13) {
                z17 = false;
            } else {
                z17 = false;
            }
            bVar3 = (b) view.getLayoutParams();
            if (aVar.f13839j) {
                if (view instanceof j) {
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                } else {
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                }
                measuredWidth = view.getMeasuredWidth();
                measuredHeight = view.getMeasuredHeight();
                baseline = view.getBaseline();
                if (z10) {
                    int[] iArr1111114 = eVar.f12715h;
                    iArr1111114[0] = measuredWidth;
                    iArr1111114[2] = measuredHeight;
                } else {
                    int[] iArr1111115 = eVar.f12715h;
                    iArr1111115[0] = 0;
                    iArr1111115[2] = 0;
                }
                if (z11) {
                    int[] iArr1111116 = eVar.f12715h;
                    iArr1111116[1] = measuredHeight;
                    iArr1111116[3] = measuredWidth;
                } else {
                    int[] iArr1111117 = eVar.f12715h;
                    iArr1111117[1] = 0;
                    iArr1111117[3] = 0;
                }
                i11 = eVar.f12729o;
                if (i11 > 0) {
                    measuredWidth2 = Math.max(i11, measuredWidth);
                } else {
                    measuredWidth2 = measuredWidth;
                }
                i12 = eVar.f12731p;
                if (i12 > 0) {
                    measuredWidth2 = Math.min(i12, measuredWidth2);
                }
                i13 = eVar.f12735r;
                if (i13 > 0) {
                    measuredHeight2 = Math.max(i13, measuredHeight);
                } else {
                    measuredHeight2 = measuredHeight;
                }
                i14 = eVar.f12737s;
                if (i14 > 0) {
                    measuredHeight2 = Math.min(i14, measuredHeight2);
                }
                if (!z16) {
                    if (z17) {
                        measuredHeight2 = (int) ((measuredWidth2 / eVar.f12691Q) + 0.5f);
                    }
                } else if (z17) {
                    measuredHeight2 = (int) ((measuredWidth2 / eVar.f12691Q) + 0.5f);
                }
                if (measuredWidth == measuredWidth2) {
                    if (measuredWidth != measuredWidth2) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                    }
                    if (measuredHeight != measuredHeight2) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    measuredWidth2 = view.getMeasuredWidth();
                    measuredHeight2 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                } else {
                    if (measuredWidth != measuredWidth2) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                    }
                    if (measuredHeight != measuredHeight2) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    measuredWidth2 = view.getMeasuredWidth();
                    measuredHeight2 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                }
            } else {
                if (view instanceof j) {
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                } else {
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                }
                measuredWidth = view.getMeasuredWidth();
                measuredHeight = view.getMeasuredHeight();
                baseline = view.getBaseline();
                if (z10) {
                    int[] iArr1111118 = eVar.f12715h;
                    iArr1111118[0] = measuredWidth;
                    iArr1111118[2] = measuredHeight;
                } else {
                    int[] iArr1111119 = eVar.f12715h;
                    iArr1111119[0] = 0;
                    iArr1111119[2] = 0;
                }
                if (z11) {
                    int[] iArr11111110 = eVar.f12715h;
                    iArr11111110[1] = measuredHeight;
                    iArr11111110[3] = measuredWidth;
                } else {
                    int[] iArr11111111 = eVar.f12715h;
                    iArr11111111[1] = 0;
                    iArr11111111[3] = 0;
                }
                i11 = eVar.f12729o;
                if (i11 > 0) {
                    measuredWidth2 = Math.max(i11, measuredWidth);
                } else {
                    measuredWidth2 = measuredWidth;
                }
                i12 = eVar.f12731p;
                if (i12 > 0) {
                    measuredWidth2 = Math.min(i12, measuredWidth2);
                }
                i13 = eVar.f12735r;
                if (i13 > 0) {
                    measuredHeight2 = Math.max(i13, measuredHeight);
                } else {
                    measuredHeight2 = measuredHeight;
                }
                i14 = eVar.f12737s;
                if (i14 > 0) {
                    measuredHeight2 = Math.min(i14, measuredHeight2);
                }
                if (!z16) {
                    if (z17) {
                        measuredHeight2 = (int) ((measuredWidth2 / eVar.f12691Q) + 0.5f);
                    }
                } else if (z17) {
                    measuredHeight2 = (int) ((measuredWidth2 / eVar.f12691Q) + 0.5f);
                }
                if (measuredWidth == measuredWidth2) {
                    if (measuredWidth != measuredWidth2) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                    }
                    if (measuredHeight != measuredHeight2) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    measuredWidth2 = view.getMeasuredWidth();
                    measuredHeight2 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                } else {
                    if (measuredWidth != measuredWidth2) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth2, 1073741824);
                    }
                    if (measuredHeight != measuredHeight2) {
                        iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824);
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    measuredWidth2 = view.getMeasuredWidth();
                    measuredHeight2 = view.getMeasuredHeight();
                    baseline = view.getBaseline();
                }
            }
            if (baseline != -1) {
                z18 = true;
            } else {
                z18 = false;
            }
            if (measuredWidth2 == aVar.f13832c) {
                z19 = true;
            } else {
                z19 = true;
            }
            aVar.f13838i = z19;
            if (bVar3.f22494Y) {
                z18 = true;
            }
            if (z18) {
                aVar.f13838i = true;
            }
            aVar.f13834e = measuredWidth2;
            aVar.f13835f = measuredHeight2;
            aVar.f13837h = z18;
            aVar.f13836g = baseline;
        }

        public void c(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f22539b = i12;
            this.f22540c = i13;
            this.f22541d = i14;
            this.f22542e = i15;
            this.f22543f = i10;
            this.f22544g = i11;
        }
    }

    public ConstraintLayout(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f22446a = new SparseArray();
        this.f22447b = new ArrayList(4);
        this.f22448c = new U0.f();
        this.f22449d = 0;
        this.f22450e = 0;
        this.f22451f = Integer.MAX_VALUE;
        this.f22452g = Integer.MAX_VALUE;
        this.f22453h = true;
        this.f22454i = 263;
        this.f22455j = null;
        this.f22456k = null;
        this.f22457l = -1;
        this.f22458m = new HashMap();
        this.f22459n = -1;
        this.f22460o = -1;
        this.f22461p = -1;
        this.f22462q = -1;
        this.f22463r = 0;
        this.f22464s = 0;
        this.f22465t = new SparseArray();
        this.f22466u = new c(this);
        this.f22467v = 0;
        this.f22468w = 0;
        j(attributeSet, 0, 0);
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f22446a = new SparseArray();
        this.f22447b = new ArrayList(4);
        this.f22448c = new U0.f();
        this.f22449d = 0;
        this.f22450e = 0;
        this.f22451f = Integer.MAX_VALUE;
        this.f22452g = Integer.MAX_VALUE;
        this.f22453h = true;
        this.f22454i = 263;
        this.f22455j = null;
        this.f22456k = null;
        this.f22457l = -1;
        this.f22458m = new HashMap();
        this.f22459n = -1;
        this.f22460o = -1;
        this.f22461p = -1;
        this.f22462q = -1;
        this.f22463r = 0;
        this.f22464s = 0;
        this.f22465t = new SparseArray();
        this.f22466u = new c(this);
        this.f22467v = 0;
        this.f22468w = 0;
        j(attributeSet, i10, 0);
    }

    private final U0.e g(int i10) {
        if (i10 == 0) {
            return this.f22448c;
        }
        View viewFindViewById = (View) this.f22446a.get(i10);
        if (viewFindViewById == null && (viewFindViewById = findViewById(i10)) != null && viewFindViewById != this && viewFindViewById.getParent() == this) {
            onViewAdded(viewFindViewById);
        }
        if (viewFindViewById == this) {
            return this.f22448c;
        }
        if (viewFindViewById == null) {
            return null;
        }
        return ((b) viewFindViewById.getLayoutParams()).f22523n0;
    }

    private int getPaddingWidth() {
        int iMax = Math.max(0, getPaddingLeft()) + Math.max(0, getPaddingRight());
        int iMax2 = Math.max(0, getPaddingStart()) + Math.max(0, getPaddingEnd());
        return iMax2 > 0 ? iMax2 : iMax;
    }

    private void j(AttributeSet attributeSet, int i10, int i11) {
        this.f22448c.c0(this);
        this.f22448c.f1(this.f22466u);
        this.f22446a.put(getId(), this);
        this.f22455j = null;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, i.f22847a1, i10, i11);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i12 = 0; i12 < indexCount; i12++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i12);
                if (index == i.f22917k1) {
                    this.f22449d = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f22449d);
                } else if (index == i.f22924l1) {
                    this.f22450e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f22450e);
                } else if (index == i.f22903i1) {
                    this.f22451f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f22451f);
                } else if (index == i.f22910j1) {
                    this.f22452g = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f22452g);
                } else if (index == i.f22758L2) {
                    this.f22454i = typedArrayObtainStyledAttributes.getInt(index, this.f22454i);
                } else if (index == i.f22763M1) {
                    int resourceId = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            m(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.f22456k = null;
                        }
                    }
                } else if (index == i.f22973s1) {
                    int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(index, 0);
                    try {
                        e eVar = new e();
                        this.f22455j = eVar;
                        eVar.k(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.f22455j = null;
                    }
                    this.f22457l = resourceId2;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.f22448c.g1(this.f22454i);
    }

    private void l() {
        this.f22453h = true;
        this.f22459n = -1;
        this.f22460o = -1;
        this.f22461p = -1;
        this.f22462q = -1;
        this.f22463r = 0;
        this.f22464s = 0;
    }

    private void p() {
        boolean zIsInEditMode = isInEditMode();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            U0.e eVarI = i(getChildAt(i10));
            if (eVarI != null) {
                eVarI.Y();
            }
        }
        if (zIsInEditMode) {
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                try {
                    String resourceName = getResources().getResourceName(childAt.getId());
                    q(0, resourceName, Integer.valueOf(childAt.getId()));
                    int iIndexOf = resourceName.indexOf(47);
                    if (iIndexOf != -1) {
                        resourceName = resourceName.substring(iIndexOf + 1);
                    }
                    g(childAt.getId()).d0(resourceName);
                } catch (Resources.NotFoundException unused) {
                }
            }
        }
        if (this.f22457l != -1) {
            for (int i12 = 0; i12 < childCount; i12++) {
                getChildAt(i12).getId();
            }
        }
        e eVar = this.f22455j;
        if (eVar != null) {
            eVar.d(this, true);
        }
        this.f22448c.M0();
        int size = this.f22447b.size();
        if (size > 0) {
            for (int i13 = 0; i13 < size; i13++) {
                ((androidx.constraintlayout.widget.c) this.f22447b.get(i13)).l(this);
            }
        }
        for (int i14 = 0; i14 < childCount; i14++) {
            getChildAt(i14);
        }
        this.f22465t.clear();
        this.f22465t.put(0, this.f22448c);
        this.f22465t.put(getId(), this.f22448c);
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt2 = getChildAt(i15);
            this.f22465t.put(childAt2.getId(), i(childAt2));
        }
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt3 = getChildAt(i16);
            U0.e eVarI2 = i(childAt3);
            if (eVarI2 != null) {
                b bVar = (b) childAt3.getLayoutParams();
                this.f22448c.c(eVarI2);
                c(zIsInEditMode, childAt3, eVarI2, bVar, this.f22465t);
            }
        }
    }

    private boolean s() {
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            if (getChildAt(i10).isLayoutRequested()) {
                z10 = true;
                break;
            }
        }
        if (z10) {
            p();
        }
        return z10;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        super.addView(view, i10, layoutParams);
    }

    /* JADX WARN: Code duplicated, block: B:66:0x0146  */
    /* JADX WARN: Code duplicated, block: B:74:0x0198  */
    /* JADX WARN: Code duplicated, block: B:77:0x01a1  */
    protected void c(boolean z10, View view, U0.e eVar, b bVar, SparseArray sparseArray) {
        U0.e eVar2;
        U0.e eVar3;
        U0.e eVar4;
        U0.e eVar5;
        U0.e eVar6;
        int i10;
        float f10;
        View view2;
        U0.e eVar7;
        int i11;
        bVar.a();
        bVar.f22525o0 = false;
        eVar.D0(view.getVisibility());
        if (bVar.f22499b0) {
            eVar.p0(true);
            eVar.D0(8);
        }
        eVar.c0(view);
        if (view instanceof androidx.constraintlayout.widget.c) {
            ((androidx.constraintlayout.widget.c) view).h(eVar, this.f22448c.a1());
        }
        if (bVar.f22495Z) {
            U0.h hVar = (U0.h) eVar;
            int i12 = bVar.f22517k0;
            int i13 = bVar.f22519l0;
            float f11 = bVar.f22521m0;
            if (f11 != -1.0f) {
                hVar.Q0(f11);
                return;
            } else if (i12 != -1) {
                hVar.O0(i12);
                return;
            } else {
                if (i13 != -1) {
                    hVar.P0(i13);
                    return;
                }
                return;
            }
        }
        int i14 = bVar.f22503d0;
        int i15 = bVar.f22505e0;
        int i16 = bVar.f22507f0;
        int i17 = bVar.f22509g0;
        int i18 = bVar.f22511h0;
        int i19 = bVar.f22513i0;
        float f12 = bVar.f22515j0;
        int i20 = bVar.f22520m;
        if (i20 != -1) {
            U0.e eVar8 = (U0.e) sparseArray.get(i20);
            if (eVar8 != null) {
                eVar.k(eVar8, bVar.f22524o, bVar.f22522n);
            }
            eVar6 = eVar;
        } else {
            if (i14 != -1) {
                U0.e eVar9 = (U0.e) sparseArray.get(i14);
                if (eVar9 != null) {
                    U0.d.b bVar2 = U0.d.b.LEFT;
                    eVar.T(bVar2, eVar9, bVar2, ((ViewGroup.MarginLayoutParams) bVar).leftMargin, i18);
                }
            } else if (i15 != -1 && (eVar2 = (U0.e) sparseArray.get(i15)) != null) {
                eVar.T(U0.d.b.LEFT, eVar2, U0.d.b.RIGHT, ((ViewGroup.MarginLayoutParams) bVar).leftMargin, i18);
            }
            if (i16 != -1) {
                U0.e eVar10 = (U0.e) sparseArray.get(i16);
                if (eVar10 != null) {
                    eVar.T(U0.d.b.RIGHT, eVar10, U0.d.b.LEFT, ((ViewGroup.MarginLayoutParams) bVar).rightMargin, i19);
                }
            } else if (i17 != -1 && (eVar3 = (U0.e) sparseArray.get(i17)) != null) {
                U0.d.b bVar3 = U0.d.b.RIGHT;
                eVar.T(bVar3, eVar3, bVar3, ((ViewGroup.MarginLayoutParams) bVar).rightMargin, i19);
            }
            int i21 = bVar.f22510h;
            if (i21 != -1) {
                U0.e eVar11 = (U0.e) sparseArray.get(i21);
                if (eVar11 != null) {
                    U0.d.b bVar4 = U0.d.b.TOP;
                    eVar.T(bVar4, eVar11, bVar4, ((ViewGroup.MarginLayoutParams) bVar).topMargin, bVar.f22531u);
                }
            } else {
                int i22 = bVar.f22512i;
                if (i22 != -1 && (eVar4 = (U0.e) sparseArray.get(i22)) != null) {
                    eVar.T(U0.d.b.TOP, eVar4, U0.d.b.BOTTOM, ((ViewGroup.MarginLayoutParams) bVar).topMargin, bVar.f22531u);
                }
            }
            int i23 = bVar.f22514j;
            if (i23 != -1) {
                U0.e eVar12 = (U0.e) sparseArray.get(i23);
                if (eVar12 != null) {
                    eVar.T(U0.d.b.BOTTOM, eVar12, U0.d.b.TOP, ((ViewGroup.MarginLayoutParams) bVar).bottomMargin, bVar.f22533w);
                }
            } else {
                int i24 = bVar.f22516k;
                if (i24 != -1 && (eVar5 = (U0.e) sparseArray.get(i24)) != null) {
                    U0.d.b bVar5 = U0.d.b.BOTTOM;
                    eVar6 = eVar;
                    eVar6.T(bVar5, eVar5, bVar5, ((ViewGroup.MarginLayoutParams) bVar).bottomMargin, bVar.f22533w);
                }
                i10 = bVar.f22518l;
                if (i10 != -1) {
                    view2 = (View) this.f22446a.get(i10);
                    eVar7 = (U0.e) sparseArray.get(bVar.f22518l);
                    if (eVar7 != null && view2 != null && (view2.getLayoutParams() instanceof b)) {
                        b bVar6 = (b) view2.getLayoutParams();
                        bVar.f22494Y = true;
                        bVar6.f22494Y = true;
                        U0.d.b bVar7 = U0.d.b.BASELINE;
                        eVar6.m(bVar7).b(eVar7.m(bVar7), 0, -1, true);
                        eVar6.g0(true);
                        bVar6.f22523n0.g0(true);
                        eVar6.m(U0.d.b.TOP).l();
                        eVar6.m(U0.d.b.BOTTOM).l();
                    }
                }
                if (f12 >= 0.0f) {
                    eVar6.i0(f12);
                }
                f10 = bVar.f22470A;
                if (f10 >= 0.0f) {
                    eVar6.x0(f10);
                }
            }
            eVar6 = eVar;
            i10 = bVar.f22518l;
            if (i10 != -1) {
                view2 = (View) this.f22446a.get(i10);
                eVar7 = (U0.e) sparseArray.get(bVar.f22518l);
                if (eVar7 != null) {
                    b bVar8 = (b) view2.getLayoutParams();
                    bVar.f22494Y = true;
                    bVar8.f22494Y = true;
                    U0.d.b bVar9 = U0.d.b.BASELINE;
                    eVar6.m(bVar9).b(eVar7.m(bVar9), 0, -1, true);
                    eVar6.g0(true);
                    bVar8.f22523n0.g0(true);
                    eVar6.m(U0.d.b.TOP).l();
                    eVar6.m(U0.d.b.BOTTOM).l();
                }
            }
            if (f12 >= 0.0f) {
                eVar6.i0(f12);
            }
            f10 = bVar.f22470A;
            if (f10 >= 0.0f) {
                eVar6.x0(f10);
            }
        }
        if (z10 && ((i11 = bVar.f22486Q) != -1 || bVar.f22487R != -1)) {
            eVar6.v0(i11, bVar.f22487R);
        }
        if (bVar.f22492W) {
            eVar6.l0(U0.e.b.FIXED);
            eVar6.E0(((ViewGroup.MarginLayoutParams) bVar).width);
            if (((ViewGroup.MarginLayoutParams) bVar).width == -2) {
                eVar6.l0(U0.e.b.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) bVar).width == -1) {
            if (bVar.f22489T) {
                eVar6.l0(U0.e.b.MATCH_CONSTRAINT);
            } else {
                eVar6.l0(U0.e.b.MATCH_PARENT);
            }
            eVar6.m(U0.d.b.LEFT).f12660e = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
            eVar6.m(U0.d.b.RIGHT).f12660e = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
        } else {
            eVar6.l0(U0.e.b.MATCH_CONSTRAINT);
            eVar6.E0(0);
        }
        if (bVar.f22493X) {
            eVar6.A0(U0.e.b.FIXED);
            eVar6.h0(((ViewGroup.MarginLayoutParams) bVar).height);
            if (((ViewGroup.MarginLayoutParams) bVar).height == -2) {
                eVar6.A0(U0.e.b.WRAP_CONTENT);
            }
        } else if (((ViewGroup.MarginLayoutParams) bVar).height == -1) {
            if (bVar.f22490U) {
                eVar6.A0(U0.e.b.MATCH_CONSTRAINT);
            } else {
                eVar6.A0(U0.e.b.MATCH_PARENT);
            }
            eVar6.m(U0.d.b.TOP).f12660e = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
            eVar6.m(U0.d.b.BOTTOM).f12660e = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
        } else {
            eVar6.A0(U0.e.b.MATCH_CONSTRAINT);
            eVar6.h0(0);
        }
        eVar6.e0(bVar.f22471B);
        eVar6.n0(bVar.f22474E);
        eVar6.C0(bVar.f22475F);
        eVar6.j0(bVar.f22476G);
        eVar6.y0(bVar.f22477H);
        eVar6.m0(bVar.f22478I, bVar.f22480K, bVar.f22482M, bVar.f22484O);
        eVar6.B0(bVar.f22479J, bVar.f22481L, bVar.f22483N, bVar.f22485P);
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public b generateDefaultLayoutParams() {
        return new b(-2, -2);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.f22447b;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i10 = 0; i10 < size; i10++) {
                ((androidx.constraintlayout.widget.c) this.f22447b.get(i10)).k(this);
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            int childCount = getChildCount();
            float width = getWidth();
            float height = getHeight();
            for (int i11 = 0; i11 < childCount; i11++) {
                View childAt = getChildAt(i11);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] strArrSplit = ((String) tag).split(",");
                    if (strArrSplit.length == 4) {
                        int i12 = Integer.parseInt(strArrSplit[0]);
                        int i13 = Integer.parseInt(strArrSplit[1]);
                        int i14 = Integer.parseInt(strArrSplit[2]);
                        int i15 = (int) ((i12 / 1080.0f) * width);
                        int i16 = (int) ((i13 / 1920.0f) * height);
                        int i17 = (int) ((Integer.parseInt(strArrSplit[3]) / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f10 = i15;
                        float f11 = i16;
                        float f12 = i15 + ((int) ((i14 / 1080.0f) * width));
                        canvas.drawLine(f10, f11, f12, f11, paint);
                        float f13 = i16 + i17;
                        canvas.drawLine(f12, f11, f12, f13, paint);
                        canvas.drawLine(f12, f13, f10, f13, paint);
                        canvas.drawLine(f10, f13, f10, f11, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f10, f11, f12, f13, paint);
                        canvas.drawLine(f10, f13, f12, f11, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public b generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    public Object f(int i10, Object obj) {
        if (i10 != 0 || !(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        HashMap map = this.f22458m;
        if (map == null || !map.containsKey(str)) {
            return null;
        }
        return this.f22458m.get(str);
    }

    @Override // android.view.View
    public void forceLayout() {
        l();
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    public int getMaxHeight() {
        return this.f22452g;
    }

    public int getMaxWidth() {
        return this.f22451f;
    }

    public int getMinHeight() {
        return this.f22450e;
    }

    public int getMinWidth() {
        return this.f22449d;
    }

    public int getOptimizationLevel() {
        return this.f22448c.V0();
    }

    public View h(int i10) {
        return (View) this.f22446a.get(i10);
    }

    public final U0.e i(View view) {
        if (view == this) {
            return this.f22448c;
        }
        if (view == null) {
            return null;
        }
        return ((b) view.getLayoutParams()).f22523n0;
    }

    protected boolean k() {
        return (getContext().getApplicationInfo().flags & 4194304) != 0 && 1 == getLayoutDirection();
    }

    protected void m(int i10) {
        this.f22456k = new d(getContext(), this, i10);
    }

    protected void n(int i10, int i11, int i12, int i13, boolean z10, boolean z11) {
        c cVar = this.f22466u;
        int i14 = cVar.f22542e;
        int iResolveSizeAndState = View.resolveSizeAndState(i12 + cVar.f22541d, i10, 0);
        int iResolveSizeAndState2 = View.resolveSizeAndState(i13 + i14, i11, 0) & 16777215;
        int iMin = Math.min(this.f22451f, iResolveSizeAndState & 16777215);
        int iMin2 = Math.min(this.f22452g, iResolveSizeAndState2);
        if (z10) {
            iMin |= 16777216;
        }
        if (z11) {
            iMin2 |= 16777216;
        }
        setMeasuredDimension(iMin, iMin2);
        this.f22459n = iMin;
        this.f22460o = iMin2;
    }

    protected void o(U0.f fVar, int i10, int i11, int i12) {
        int i13;
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i12);
        int size2 = View.MeasureSpec.getSize(i12);
        int iMax = Math.max(0, getPaddingTop());
        int iMax2 = Math.max(0, getPaddingBottom());
        int i14 = iMax + iMax2;
        int paddingWidth = getPaddingWidth();
        this.f22466u.c(i11, i12, iMax, iMax2, paddingWidth, i14);
        int iMax3 = Math.max(0, getPaddingStart());
        int iMax4 = Math.max(0, getPaddingEnd());
        if (iMax3 > 0 || iMax4 > 0) {
            if (k()) {
                i13 = iMax4;
            }
            int i15 = size - paddingWidth;
            int i16 = size2 - i14;
            r(fVar, mode, i15, mode2, i16);
            fVar.c1(i10, mode, i15, mode2, i16, this.f22459n, this.f22460o, i13, iMax);
        }
        iMax3 = Math.max(0, getPaddingLeft());
        i13 = iMax3;
        int i17 = size - paddingWidth;
        int i18 = size2 - i14;
        r(fVar, mode, i17, mode2, i18);
        fVar.c1(i10, mode, i17, mode2, i18, this.f22459n, this.f22460o, i13, iMax);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        boolean zIsInEditMode = isInEditMode();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            b bVar = (b) childAt.getLayoutParams();
            U0.e eVar = bVar.f22523n0;
            if ((childAt.getVisibility() != 8 || bVar.f22495Z || bVar.f22497a0 || bVar.f22501c0 || zIsInEditMode) && !bVar.f22499b0) {
                int iQ = eVar.Q();
                int iR = eVar.R();
                childAt.layout(iQ, iR, eVar.P() + iQ, eVar.v() + iR);
            }
        }
        int size = this.f22447b.size();
        if (size > 0) {
            for (int i15 = 0; i15 < size; i15++) {
                ((androidx.constraintlayout.widget.c) this.f22447b.get(i15)).i(this);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        this.f22467v = i10;
        this.f22468w = i11;
        this.f22448c.h1(k());
        if (this.f22453h) {
            this.f22453h = false;
            if (s()) {
                this.f22448c.j1();
            }
        }
        o(this.f22448c, this.f22454i, i10, i11);
        n(i10, i11, this.f22448c.P(), this.f22448c.v(), this.f22448c.b1(), this.f22448c.Z0());
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        super.onViewAdded(view);
        U0.e eVarI = i(view);
        if ((view instanceof g) && !(eVarI instanceof U0.h)) {
            b bVar = (b) view.getLayoutParams();
            U0.h hVar = new U0.h();
            bVar.f22523n0 = hVar;
            bVar.f22495Z = true;
            hVar.R0(bVar.f22488S);
        }
        if (view instanceof androidx.constraintlayout.widget.c) {
            androidx.constraintlayout.widget.c cVar = (androidx.constraintlayout.widget.c) view;
            cVar.m();
            ((b) view.getLayoutParams()).f22497a0 = true;
            if (!this.f22447b.contains(cVar)) {
                this.f22447b.add(cVar);
            }
        }
        this.f22446a.put(view.getId(), view);
        this.f22453h = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.f22446a.remove(view.getId());
        this.f22448c.L0(i(view));
        this.f22447b.remove(view);
        this.f22453h = true;
    }

    public void q(int i10, Object obj, Object obj2) {
        if (i10 == 0 && (obj instanceof String) && (obj2 instanceof Integer)) {
            if (this.f22458m == null) {
                this.f22458m = new HashMap();
            }
            String strSubstring = (String) obj;
            int iIndexOf = strSubstring.indexOf("/");
            if (iIndexOf != -1) {
                strSubstring = strSubstring.substring(iIndexOf + 1);
            }
            Integer num = (Integer) obj2;
            num.intValue();
            this.f22458m.put(strSubstring, num);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x003e A[PHI: r2
      0x003e: PHI (r2v4 U0.e$b) = (r2v3 U0.e$b), (r2v0 U0.e$b) binds: [B:21:0x004a, B:17:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    protected void r(U0.f fVar, int i10, int i11, int i12, int i13) {
        U0.e.b bVar;
        c cVar = this.f22466u;
        int i14 = cVar.f22542e;
        int i15 = cVar.f22541d;
        U0.e.b bVar2 = U0.e.b.FIXED;
        int childCount = getChildCount();
        if (i10 == Integer.MIN_VALUE) {
            bVar = U0.e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i11 = Math.max(0, this.f22449d);
            }
        } else if (i10 == 0) {
            bVar = U0.e.b.WRAP_CONTENT;
            i11 = childCount == 0 ? Math.max(0, this.f22449d) : 0;
        } else if (i10 != 1073741824) {
            bVar = bVar2;
        } else {
            i11 = Math.min(this.f22451f - i15, i11);
            bVar = bVar2;
        }
        if (i12 == Integer.MIN_VALUE) {
            bVar2 = U0.e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i13 = Math.max(0, this.f22450e);
            }
        } else if (i12 == 0) {
            bVar2 = U0.e.b.WRAP_CONTENT;
            if (childCount == 0) {
                i13 = Math.max(0, this.f22450e);
            } else {
                i13 = 0;
            }
        } else if (i12 != 1073741824) {
            i13 = 0;
        } else {
            i13 = Math.min(this.f22452g - i14, i13);
        }
        if (i11 != fVar.P() || i13 != fVar.v()) {
            fVar.Y0();
        }
        fVar.F0(0);
        fVar.G0(0);
        fVar.s0(this.f22451f - i15);
        fVar.r0(this.f22452g - i14);
        fVar.u0(0);
        fVar.t0(0);
        fVar.l0(bVar);
        fVar.E0(i11);
        fVar.A0(bVar2);
        fVar.h0(i13);
        fVar.u0(this.f22449d - i15);
        fVar.t0(this.f22450e - i14);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        super.removeView(view);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        l();
        super.requestLayout();
    }

    public void setConstraintSet(e eVar) {
        this.f22455j = eVar;
    }

    @Override // android.view.View
    public void setId(int i10) {
        this.f22446a.remove(getId());
        super.setId(i10);
        this.f22446a.put(getId(), this);
    }

    public void setMaxHeight(int i10) {
        if (i10 == this.f22452g) {
            return;
        }
        this.f22452g = i10;
        requestLayout();
    }

    public void setMaxWidth(int i10) {
        if (i10 == this.f22451f) {
            return;
        }
        this.f22451f = i10;
        requestLayout();
    }

    public void setMinHeight(int i10) {
        if (i10 == this.f22450e) {
            return;
        }
        this.f22450e = i10;
        requestLayout();
    }

    public void setMinWidth(int i10) {
        if (i10 == this.f22449d) {
            return;
        }
        this.f22449d = i10;
        requestLayout();
    }

    public void setOnConstraintsChanged(f fVar) {
        d dVar = this.f22456k;
        if (dVar != null) {
            dVar.c(fVar);
        }
    }

    public void setOptimizationLevel(int i10) {
        this.f22454i = i10;
        this.f22448c.g1(i10);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }
}
