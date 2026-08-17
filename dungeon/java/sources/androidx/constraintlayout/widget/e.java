package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int[] f22588d = {0, 4, 8};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static SparseIntArray f22589e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private HashMap f22590a = new HashMap();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f22591b = true;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private HashMap f22592c = new HashMap();

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f22593a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f22594b = new d();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c f22595c = new c();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final b f22596d = new b();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final C0277e f22597e = new C0277e();

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public HashMap f22598f = new HashMap();

        /* JADX INFO: Access modifiers changed from: private */
        public void d(int i10, ConstraintLayout.b bVar) {
            this.f22593a = i10;
            b bVar2 = this.f22596d;
            bVar2.f22640h = bVar.f22502d;
            bVar2.f22642i = bVar.f22504e;
            bVar2.f22644j = bVar.f22506f;
            bVar2.f22646k = bVar.f22508g;
            bVar2.f22647l = bVar.f22510h;
            bVar2.f22648m = bVar.f22512i;
            bVar2.f22649n = bVar.f22514j;
            bVar2.f22650o = bVar.f22516k;
            bVar2.f22651p = bVar.f22518l;
            bVar2.f22652q = bVar.f22526p;
            bVar2.f22653r = bVar.f22527q;
            bVar2.f22654s = bVar.f22528r;
            bVar2.f22655t = bVar.f22529s;
            bVar2.f22656u = bVar.f22536z;
            bVar2.f22657v = bVar.f22470A;
            bVar2.f22658w = bVar.f22471B;
            bVar2.f22659x = bVar.f22520m;
            bVar2.f22660y = bVar.f22522n;
            bVar2.f22661z = bVar.f22524o;
            bVar2.f22600A = bVar.f22486Q;
            bVar2.f22601B = bVar.f22487R;
            bVar2.f22602C = bVar.f22488S;
            bVar2.f22638g = bVar.f22500c;
            bVar2.f22634e = bVar.f22496a;
            bVar2.f22636f = bVar.f22498b;
            bVar2.f22630c = ((ViewGroup.MarginLayoutParams) bVar).width;
            bVar2.f22632d = ((ViewGroup.MarginLayoutParams) bVar).height;
            bVar2.f22603D = ((ViewGroup.MarginLayoutParams) bVar).leftMargin;
            bVar2.f22604E = ((ViewGroup.MarginLayoutParams) bVar).rightMargin;
            bVar2.f22605F = ((ViewGroup.MarginLayoutParams) bVar).topMargin;
            bVar2.f22606G = ((ViewGroup.MarginLayoutParams) bVar).bottomMargin;
            bVar2.f22615P = bVar.f22475F;
            bVar2.f22616Q = bVar.f22474E;
            bVar2.f22618S = bVar.f22477H;
            bVar2.f22617R = bVar.f22476G;
            bVar2.f22641h0 = bVar.f22489T;
            bVar2.f22643i0 = bVar.f22490U;
            bVar2.f22619T = bVar.f22478I;
            bVar2.f22620U = bVar.f22479J;
            bVar2.f22621V = bVar.f22482M;
            bVar2.f22622W = bVar.f22483N;
            bVar2.f22623X = bVar.f22480K;
            bVar2.f22624Y = bVar.f22481L;
            bVar2.f22625Z = bVar.f22484O;
            bVar2.f22627a0 = bVar.f22485P;
            bVar2.f22639g0 = bVar.f22491V;
            bVar2.f22610K = bVar.f22531u;
            bVar2.f22612M = bVar.f22533w;
            bVar2.f22609J = bVar.f22530t;
            bVar2.f22611L = bVar.f22532v;
            bVar2.f22614O = bVar.f22534x;
            bVar2.f22613N = bVar.f22535y;
            bVar2.f22607H = bVar.getMarginEnd();
            this.f22596d.f22608I = bVar.getMarginStart();
        }

        public void b(ConstraintLayout.b bVar) {
            b bVar2 = this.f22596d;
            bVar.f22502d = bVar2.f22640h;
            bVar.f22504e = bVar2.f22642i;
            bVar.f22506f = bVar2.f22644j;
            bVar.f22508g = bVar2.f22646k;
            bVar.f22510h = bVar2.f22647l;
            bVar.f22512i = bVar2.f22648m;
            bVar.f22514j = bVar2.f22649n;
            bVar.f22516k = bVar2.f22650o;
            bVar.f22518l = bVar2.f22651p;
            bVar.f22526p = bVar2.f22652q;
            bVar.f22527q = bVar2.f22653r;
            bVar.f22528r = bVar2.f22654s;
            bVar.f22529s = bVar2.f22655t;
            ((ViewGroup.MarginLayoutParams) bVar).leftMargin = bVar2.f22603D;
            ((ViewGroup.MarginLayoutParams) bVar).rightMargin = bVar2.f22604E;
            ((ViewGroup.MarginLayoutParams) bVar).topMargin = bVar2.f22605F;
            ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = bVar2.f22606G;
            bVar.f22534x = bVar2.f22614O;
            bVar.f22535y = bVar2.f22613N;
            bVar.f22531u = bVar2.f22610K;
            bVar.f22533w = bVar2.f22612M;
            bVar.f22536z = bVar2.f22656u;
            bVar.f22470A = bVar2.f22657v;
            bVar.f22520m = bVar2.f22659x;
            bVar.f22522n = bVar2.f22660y;
            bVar.f22524o = bVar2.f22661z;
            bVar.f22471B = bVar2.f22658w;
            bVar.f22486Q = bVar2.f22600A;
            bVar.f22487R = bVar2.f22601B;
            bVar.f22475F = bVar2.f22615P;
            bVar.f22474E = bVar2.f22616Q;
            bVar.f22477H = bVar2.f22618S;
            bVar.f22476G = bVar2.f22617R;
            bVar.f22489T = bVar2.f22641h0;
            bVar.f22490U = bVar2.f22643i0;
            bVar.f22478I = bVar2.f22619T;
            bVar.f22479J = bVar2.f22620U;
            bVar.f22482M = bVar2.f22621V;
            bVar.f22483N = bVar2.f22622W;
            bVar.f22480K = bVar2.f22623X;
            bVar.f22481L = bVar2.f22624Y;
            bVar.f22484O = bVar2.f22625Z;
            bVar.f22485P = bVar2.f22627a0;
            bVar.f22488S = bVar2.f22602C;
            bVar.f22500c = bVar2.f22638g;
            bVar.f22496a = bVar2.f22634e;
            bVar.f22498b = bVar2.f22636f;
            ((ViewGroup.MarginLayoutParams) bVar).width = bVar2.f22630c;
            ((ViewGroup.MarginLayoutParams) bVar).height = bVar2.f22632d;
            String str = bVar2.f22639g0;
            if (str != null) {
                bVar.f22491V = str;
            }
            bVar.setMarginStart(bVar2.f22608I);
            bVar.setMarginEnd(this.f22596d.f22607H);
            bVar.a();
        }

        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public a clone() {
            a aVar = new a();
            aVar.f22596d.a(this.f22596d);
            aVar.f22595c.a(this.f22595c);
            aVar.f22594b.a(this.f22594b);
            aVar.f22597e.a(this.f22597e);
            aVar.f22593a = this.f22593a;
            return aVar;
        }
    }

    public static class b {

        /* JADX INFO: renamed from: k0, reason: collision with root package name */
        private static SparseIntArray f22599k0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f22630c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f22632d;

        /* JADX INFO: renamed from: e0, reason: collision with root package name */
        public int[] f22635e0;

        /* JADX INFO: renamed from: f0, reason: collision with root package name */
        public String f22637f0;

        /* JADX INFO: renamed from: g0, reason: collision with root package name */
        public String f22639g0;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f22626a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f22628b = false;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f22634e = -1;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f22636f = -1;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f22638g = -1.0f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f22640h = -1;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f22642i = -1;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public int f22644j = -1;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public int f22646k = -1;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public int f22647l = -1;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public int f22648m = -1;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public int f22649n = -1;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public int f22650o = -1;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public int f22651p = -1;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public int f22652q = -1;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public int f22653r = -1;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public int f22654s = -1;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        public int f22655t = -1;

        /* JADX INFO: renamed from: u, reason: collision with root package name */
        public float f22656u = 0.5f;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        public float f22657v = 0.5f;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        public String f22658w = null;

        /* JADX INFO: renamed from: x, reason: collision with root package name */
        public int f22659x = -1;

        /* JADX INFO: renamed from: y, reason: collision with root package name */
        public int f22660y = 0;

        /* JADX INFO: renamed from: z, reason: collision with root package name */
        public float f22661z = 0.0f;

        /* JADX INFO: renamed from: A, reason: collision with root package name */
        public int f22600A = -1;

        /* JADX INFO: renamed from: B, reason: collision with root package name */
        public int f22601B = -1;

        /* JADX INFO: renamed from: C, reason: collision with root package name */
        public int f22602C = -1;

        /* JADX INFO: renamed from: D, reason: collision with root package name */
        public int f22603D = -1;

        /* JADX INFO: renamed from: E, reason: collision with root package name */
        public int f22604E = -1;

        /* JADX INFO: renamed from: F, reason: collision with root package name */
        public int f22605F = -1;

        /* JADX INFO: renamed from: G, reason: collision with root package name */
        public int f22606G = -1;

        /* JADX INFO: renamed from: H, reason: collision with root package name */
        public int f22607H = -1;

        /* JADX INFO: renamed from: I, reason: collision with root package name */
        public int f22608I = -1;

        /* JADX INFO: renamed from: J, reason: collision with root package name */
        public int f22609J = -1;

        /* JADX INFO: renamed from: K, reason: collision with root package name */
        public int f22610K = -1;

        /* JADX INFO: renamed from: L, reason: collision with root package name */
        public int f22611L = -1;

        /* JADX INFO: renamed from: M, reason: collision with root package name */
        public int f22612M = -1;

        /* JADX INFO: renamed from: N, reason: collision with root package name */
        public int f22613N = -1;

        /* JADX INFO: renamed from: O, reason: collision with root package name */
        public int f22614O = -1;

        /* JADX INFO: renamed from: P, reason: collision with root package name */
        public float f22615P = -1.0f;

        /* JADX INFO: renamed from: Q, reason: collision with root package name */
        public float f22616Q = -1.0f;

        /* JADX INFO: renamed from: R, reason: collision with root package name */
        public int f22617R = 0;

        /* JADX INFO: renamed from: S, reason: collision with root package name */
        public int f22618S = 0;

        /* JADX INFO: renamed from: T, reason: collision with root package name */
        public int f22619T = 0;

        /* JADX INFO: renamed from: U, reason: collision with root package name */
        public int f22620U = 0;

        /* JADX INFO: renamed from: V, reason: collision with root package name */
        public int f22621V = -1;

        /* JADX INFO: renamed from: W, reason: collision with root package name */
        public int f22622W = -1;

        /* JADX INFO: renamed from: X, reason: collision with root package name */
        public int f22623X = -1;

        /* JADX INFO: renamed from: Y, reason: collision with root package name */
        public int f22624Y = -1;

        /* JADX INFO: renamed from: Z, reason: collision with root package name */
        public float f22625Z = 1.0f;

        /* JADX INFO: renamed from: a0, reason: collision with root package name */
        public float f22627a0 = 1.0f;

        /* JADX INFO: renamed from: b0, reason: collision with root package name */
        public int f22629b0 = -1;

        /* JADX INFO: renamed from: c0, reason: collision with root package name */
        public int f22631c0 = 0;

        /* JADX INFO: renamed from: d0, reason: collision with root package name */
        public int f22633d0 = -1;

        /* JADX INFO: renamed from: h0, reason: collision with root package name */
        public boolean f22641h0 = false;

        /* JADX INFO: renamed from: i0, reason: collision with root package name */
        public boolean f22643i0 = false;

        /* JADX INFO: renamed from: j0, reason: collision with root package name */
        public boolean f22645j0 = true;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f22599k0 = sparseIntArray;
            sparseIntArray.append(i.f22795R3, 24);
            f22599k0.append(i.f22801S3, 25);
            f22599k0.append(i.f22813U3, 28);
            f22599k0.append(i.f22819V3, 29);
            f22599k0.append(i.f22850a4, 35);
            f22599k0.append(i.f22843Z3, 34);
            f22599k0.append(i.f22705C3, 4);
            f22599k0.append(i.f22699B3, 3);
            f22599k0.append(i.f23021z3, 1);
            f22599k0.append(i.f22885f4, 6);
            f22599k0.append(i.f22892g4, 7);
            f22599k0.append(i.f22747J3, 17);
            f22599k0.append(i.f22753K3, 18);
            f22599k0.append(i.f22759L3, 19);
            f22599k0.append(i.f22919k3, 26);
            f22599k0.append(i.f22825W3, 31);
            f22599k0.append(i.f22831X3, 32);
            f22599k0.append(i.f22741I3, 10);
            f22599k0.append(i.f22735H3, 9);
            f22599k0.append(i.f22913j4, 13);
            f22599k0.append(i.f22934m4, 16);
            f22599k0.append(i.f22920k4, 14);
            f22599k0.append(i.f22899h4, 11);
            f22599k0.append(i.f22927l4, 15);
            f22599k0.append(i.f22906i4, 12);
            f22599k0.append(i.f22871d4, 38);
            f22599k0.append(i.f22783P3, 37);
            f22599k0.append(i.f22777O3, 39);
            f22599k0.append(i.f22864c4, 40);
            f22599k0.append(i.f22771N3, 20);
            f22599k0.append(i.f22857b4, 36);
            f22599k0.append(i.f22729G3, 5);
            f22599k0.append(i.f22789Q3, 76);
            f22599k0.append(i.f22837Y3, 76);
            f22599k0.append(i.f22807T3, 76);
            f22599k0.append(i.f22693A3, 76);
            f22599k0.append(i.f23015y3, 76);
            f22599k0.append(i.f22940n3, 23);
            f22599k0.append(i.f22954p3, 27);
            f22599k0.append(i.f22968r3, 30);
            f22599k0.append(i.f22975s3, 8);
            f22599k0.append(i.f22947o3, 33);
            f22599k0.append(i.f22961q3, 2);
            f22599k0.append(i.f22926l3, 22);
            f22599k0.append(i.f22933m3, 21);
            f22599k0.append(i.f22711D3, 61);
            f22599k0.append(i.f22723F3, 62);
            f22599k0.append(i.f22717E3, 63);
            f22599k0.append(i.f22878e4, 69);
            f22599k0.append(i.f22765M3, 70);
            f22599k0.append(i.f23003w3, 71);
            f22599k0.append(i.f22989u3, 72);
            f22599k0.append(i.f22996v3, 73);
            f22599k0.append(i.f23009x3, 74);
            f22599k0.append(i.f22982t3, 75);
        }

        public void a(b bVar) {
            this.f22626a = bVar.f22626a;
            this.f22630c = bVar.f22630c;
            this.f22628b = bVar.f22628b;
            this.f22632d = bVar.f22632d;
            this.f22634e = bVar.f22634e;
            this.f22636f = bVar.f22636f;
            this.f22638g = bVar.f22638g;
            this.f22640h = bVar.f22640h;
            this.f22642i = bVar.f22642i;
            this.f22644j = bVar.f22644j;
            this.f22646k = bVar.f22646k;
            this.f22647l = bVar.f22647l;
            this.f22648m = bVar.f22648m;
            this.f22649n = bVar.f22649n;
            this.f22650o = bVar.f22650o;
            this.f22651p = bVar.f22651p;
            this.f22652q = bVar.f22652q;
            this.f22653r = bVar.f22653r;
            this.f22654s = bVar.f22654s;
            this.f22655t = bVar.f22655t;
            this.f22656u = bVar.f22656u;
            this.f22657v = bVar.f22657v;
            this.f22658w = bVar.f22658w;
            this.f22659x = bVar.f22659x;
            this.f22660y = bVar.f22660y;
            this.f22661z = bVar.f22661z;
            this.f22600A = bVar.f22600A;
            this.f22601B = bVar.f22601B;
            this.f22602C = bVar.f22602C;
            this.f22603D = bVar.f22603D;
            this.f22604E = bVar.f22604E;
            this.f22605F = bVar.f22605F;
            this.f22606G = bVar.f22606G;
            this.f22607H = bVar.f22607H;
            this.f22608I = bVar.f22608I;
            this.f22609J = bVar.f22609J;
            this.f22610K = bVar.f22610K;
            this.f22611L = bVar.f22611L;
            this.f22612M = bVar.f22612M;
            this.f22613N = bVar.f22613N;
            this.f22614O = bVar.f22614O;
            this.f22615P = bVar.f22615P;
            this.f22616Q = bVar.f22616Q;
            this.f22617R = bVar.f22617R;
            this.f22618S = bVar.f22618S;
            this.f22619T = bVar.f22619T;
            this.f22620U = bVar.f22620U;
            this.f22621V = bVar.f22621V;
            this.f22622W = bVar.f22622W;
            this.f22623X = bVar.f22623X;
            this.f22624Y = bVar.f22624Y;
            this.f22625Z = bVar.f22625Z;
            this.f22627a0 = bVar.f22627a0;
            this.f22629b0 = bVar.f22629b0;
            this.f22631c0 = bVar.f22631c0;
            this.f22633d0 = bVar.f22633d0;
            this.f22639g0 = bVar.f22639g0;
            int[] iArr = bVar.f22635e0;
            if (iArr != null) {
                this.f22635e0 = Arrays.copyOf(iArr, iArr.length);
            } else {
                this.f22635e0 = null;
            }
            this.f22637f0 = bVar.f22637f0;
            this.f22641h0 = bVar.f22641h0;
            this.f22643i0 = bVar.f22643i0;
            this.f22645j0 = bVar.f22645j0;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f22912j3);
            this.f22628b = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                int i11 = f22599k0.get(index);
                if (i11 == 80) {
                    this.f22641h0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f22641h0);
                } else if (i11 != 81) {
                    switch (i11) {
                        case 1:
                            this.f22651p = e.m(typedArrayObtainStyledAttributes, index, this.f22651p);
                            break;
                        case 2:
                            this.f22606G = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22606G);
                            break;
                        case 3:
                            this.f22650o = e.m(typedArrayObtainStyledAttributes, index, this.f22650o);
                            break;
                        case 4:
                            this.f22649n = e.m(typedArrayObtainStyledAttributes, index, this.f22649n);
                            break;
                        case 5:
                            this.f22658w = typedArrayObtainStyledAttributes.getString(index);
                            break;
                        case 6:
                            this.f22600A = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f22600A);
                            break;
                        case 7:
                            this.f22601B = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f22601B);
                            break;
                        case 8:
                            this.f22607H = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22607H);
                            break;
                        case 9:
                            this.f22655t = e.m(typedArrayObtainStyledAttributes, index, this.f22655t);
                            break;
                        case 10:
                            this.f22654s = e.m(typedArrayObtainStyledAttributes, index, this.f22654s);
                            break;
                        case 11:
                            this.f22612M = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22612M);
                            break;
                        case 12:
                            this.f22613N = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22613N);
                            break;
                        case 13:
                            this.f22609J = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22609J);
                            break;
                        case 14:
                            this.f22611L = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22611L);
                            break;
                        case 15:
                            this.f22614O = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22614O);
                            break;
                        case 16:
                            this.f22610K = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22610K);
                            break;
                        case 17:
                            this.f22634e = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f22634e);
                            break;
                        case 18:
                            this.f22636f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(index, this.f22636f);
                            break;
                        case 19:
                            this.f22638g = typedArrayObtainStyledAttributes.getFloat(index, this.f22638g);
                            break;
                        case 20:
                            this.f22656u = typedArrayObtainStyledAttributes.getFloat(index, this.f22656u);
                            break;
                        case 21:
                            this.f22632d = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f22632d);
                            break;
                        case 22:
                            this.f22630c = typedArrayObtainStyledAttributes.getLayoutDimension(index, this.f22630c);
                            break;
                        case 23:
                            this.f22603D = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22603D);
                            break;
                        case 24:
                            this.f22640h = e.m(typedArrayObtainStyledAttributes, index, this.f22640h);
                            break;
                        case 25:
                            this.f22642i = e.m(typedArrayObtainStyledAttributes, index, this.f22642i);
                            break;
                        case 26:
                            this.f22602C = typedArrayObtainStyledAttributes.getInt(index, this.f22602C);
                            break;
                        case 27:
                            this.f22604E = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22604E);
                            break;
                        case 28:
                            this.f22644j = e.m(typedArrayObtainStyledAttributes, index, this.f22644j);
                            break;
                        case 29:
                            this.f22646k = e.m(typedArrayObtainStyledAttributes, index, this.f22646k);
                            break;
                        case 30:
                            this.f22608I = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22608I);
                            break;
                        case 31:
                            this.f22652q = e.m(typedArrayObtainStyledAttributes, index, this.f22652q);
                            break;
                        case 32:
                            this.f22653r = e.m(typedArrayObtainStyledAttributes, index, this.f22653r);
                            break;
                        case 33:
                            this.f22605F = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22605F);
                            break;
                        case 34:
                            this.f22648m = e.m(typedArrayObtainStyledAttributes, index, this.f22648m);
                            break;
                        case 35:
                            this.f22647l = e.m(typedArrayObtainStyledAttributes, index, this.f22647l);
                            break;
                        case 36:
                            this.f22657v = typedArrayObtainStyledAttributes.getFloat(index, this.f22657v);
                            break;
                        case 37:
                            this.f22616Q = typedArrayObtainStyledAttributes.getFloat(index, this.f22616Q);
                            break;
                        case 38:
                            this.f22615P = typedArrayObtainStyledAttributes.getFloat(index, this.f22615P);
                            break;
                        case 39:
                            this.f22617R = typedArrayObtainStyledAttributes.getInt(index, this.f22617R);
                            break;
                        case 40:
                            this.f22618S = typedArrayObtainStyledAttributes.getInt(index, this.f22618S);
                            break;
                        default:
                            switch (i11) {
                                case 54:
                                    this.f22619T = typedArrayObtainStyledAttributes.getInt(index, this.f22619T);
                                    break;
                                case 55:
                                    this.f22620U = typedArrayObtainStyledAttributes.getInt(index, this.f22620U);
                                    break;
                                case 56:
                                    this.f22621V = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22621V);
                                    break;
                                case 57:
                                    this.f22622W = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22622W);
                                    break;
                                case 58:
                                    this.f22623X = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22623X);
                                    break;
                                case 59:
                                    this.f22624Y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22624Y);
                                    break;
                                default:
                                    switch (i11) {
                                        case 61:
                                            this.f22659x = e.m(typedArrayObtainStyledAttributes, index, this.f22659x);
                                            break;
                                        case 62:
                                            this.f22660y = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22660y);
                                            break;
                                        case 63:
                                            this.f22661z = typedArrayObtainStyledAttributes.getFloat(index, this.f22661z);
                                            break;
                                        default:
                                            switch (i11) {
                                                case 69:
                                                    this.f22625Z = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                                    break;
                                                case 70:
                                                    this.f22627a0 = typedArrayObtainStyledAttributes.getFloat(index, 1.0f);
                                                    break;
                                                case 71:
                                                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                                                    break;
                                                case 72:
                                                    this.f22629b0 = typedArrayObtainStyledAttributes.getInt(index, this.f22629b0);
                                                    break;
                                                case 73:
                                                    this.f22631c0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, this.f22631c0);
                                                    break;
                                                case 74:
                                                    this.f22637f0 = typedArrayObtainStyledAttributes.getString(index);
                                                    break;
                                                case 75:
                                                    this.f22645j0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f22645j0);
                                                    break;
                                                case 76:
                                                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f22599k0.get(index));
                                                    break;
                                                case 77:
                                                    this.f22639g0 = typedArrayObtainStyledAttributes.getString(index);
                                                    break;
                                                default:
                                                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f22599k0.get(index));
                                                    break;
                                            }
                                            break;
                                    }
                                    break;
                            }
                            break;
                    }
                } else {
                    this.f22643i0 = typedArrayObtainStyledAttributes.getBoolean(index, this.f22643i0);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class c {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static SparseIntArray f22662h;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f22663a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f22664b = -1;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public String f22665c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f22666d = -1;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f22667e = 0;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f22668f = Float.NaN;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f22669g = Float.NaN;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f22662h = sparseIntArray;
            sparseIntArray.append(i.f23010x4, 1);
            f22662h.append(i.f23022z4, 2);
            f22662h.append(i.f22694A4, 3);
            f22662h.append(i.f23004w4, 4);
            f22662h.append(i.f22997v4, 5);
            f22662h.append(i.f23016y4, 6);
        }

        public void a(c cVar) {
            this.f22663a = cVar.f22663a;
            this.f22664b = cVar.f22664b;
            this.f22665c = cVar.f22665c;
            this.f22666d = cVar.f22666d;
            this.f22667e = cVar.f22667e;
            this.f22669g = cVar.f22669g;
            this.f22668f = cVar.f22668f;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f22990u4);
            this.f22663a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                switch (f22662h.get(index)) {
                    case 1:
                        this.f22669g = typedArrayObtainStyledAttributes.getFloat(index, this.f22669g);
                        break;
                    case 2:
                        this.f22666d = typedArrayObtainStyledAttributes.getInt(index, this.f22666d);
                        break;
                    case 3:
                        if (typedArrayObtainStyledAttributes.peekValue(index).type == 3) {
                            this.f22665c = typedArrayObtainStyledAttributes.getString(index);
                        } else {
                            this.f22665c = R0.a.f9867c[typedArrayObtainStyledAttributes.getInteger(index, 0)];
                        }
                        break;
                    case 4:
                        this.f22667e = typedArrayObtainStyledAttributes.getInt(index, 0);
                        break;
                    case 5:
                        this.f22664b = e.m(typedArrayObtainStyledAttributes, index, this.f22664b);
                        break;
                    case 6:
                        this.f22668f = typedArrayObtainStyledAttributes.getFloat(index, this.f22668f);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f22670a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f22671b = 0;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f22672c = 0;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f22673d = 1.0f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f22674e = Float.NaN;

        public void a(d dVar) {
            this.f22670a = dVar.f22670a;
            this.f22671b = dVar.f22671b;
            this.f22673d = dVar.f22673d;
            this.f22674e = dVar.f22674e;
            this.f22672c = dVar.f22672c;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f22748J4);
            this.f22670a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                if (index == i.f22760L4) {
                    this.f22673d = typedArrayObtainStyledAttributes.getFloat(index, this.f22673d);
                } else if (index == i.f22754K4) {
                    this.f22671b = typedArrayObtainStyledAttributes.getInt(index, this.f22671b);
                    this.f22671b = e.f22588d[this.f22671b];
                } else if (index == i.f22772N4) {
                    this.f22672c = typedArrayObtainStyledAttributes.getInt(index, this.f22672c);
                } else if (index == i.f22766M4) {
                    this.f22674e = typedArrayObtainStyledAttributes.getFloat(index, this.f22674e);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: renamed from: androidx.constraintlayout.widget.e$e, reason: collision with other inner class name */
    public static class C0277e {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private static SparseIntArray f22675n;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f22676a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public float f22677b = 0.0f;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public float f22678c = 0.0f;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public float f22679d = 0.0f;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public float f22680e = 1.0f;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public float f22681f = 1.0f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public float f22682g = Float.NaN;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public float f22683h = Float.NaN;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public float f22684i = 0.0f;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public float f22685j = 0.0f;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public float f22686k = 0.0f;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public boolean f22687l = false;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public float f22688m = 0.0f;

        static {
            SparseIntArray sparseIntArray = new SparseIntArray();
            f22675n = sparseIntArray;
            sparseIntArray.append(i.f22900h5, 1);
            f22675n.append(i.f22907i5, 2);
            f22675n.append(i.f22914j5, 3);
            f22675n.append(i.f22886f5, 4);
            f22675n.append(i.f22893g5, 5);
            f22675n.append(i.f22858b5, 6);
            f22675n.append(i.f22865c5, 7);
            f22675n.append(i.f22872d5, 8);
            f22675n.append(i.f22879e5, 9);
            f22675n.append(i.f22921k5, 10);
            f22675n.append(i.f22928l5, 11);
        }

        public void a(C0277e c0277e) {
            this.f22676a = c0277e.f22676a;
            this.f22677b = c0277e.f22677b;
            this.f22678c = c0277e.f22678c;
            this.f22679d = c0277e.f22679d;
            this.f22680e = c0277e.f22680e;
            this.f22681f = c0277e.f22681f;
            this.f22682g = c0277e.f22682g;
            this.f22683h = c0277e.f22683h;
            this.f22684i = c0277e.f22684i;
            this.f22685j = c0277e.f22685j;
            this.f22686k = c0277e.f22686k;
            this.f22687l = c0277e.f22687l;
            this.f22688m = c0277e.f22688m;
        }

        void b(Context context, AttributeSet attributeSet) {
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f22851a5);
            this.f22676a = true;
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i10);
                switch (f22675n.get(index)) {
                    case 1:
                        this.f22677b = typedArrayObtainStyledAttributes.getFloat(index, this.f22677b);
                        break;
                    case 2:
                        this.f22678c = typedArrayObtainStyledAttributes.getFloat(index, this.f22678c);
                        break;
                    case 3:
                        this.f22679d = typedArrayObtainStyledAttributes.getFloat(index, this.f22679d);
                        break;
                    case 4:
                        this.f22680e = typedArrayObtainStyledAttributes.getFloat(index, this.f22680e);
                        break;
                    case 5:
                        this.f22681f = typedArrayObtainStyledAttributes.getFloat(index, this.f22681f);
                        break;
                    case 6:
                        this.f22682g = typedArrayObtainStyledAttributes.getDimension(index, this.f22682g);
                        break;
                    case 7:
                        this.f22683h = typedArrayObtainStyledAttributes.getDimension(index, this.f22683h);
                        break;
                    case 8:
                        this.f22684i = typedArrayObtainStyledAttributes.getDimension(index, this.f22684i);
                        break;
                    case 9:
                        this.f22685j = typedArrayObtainStyledAttributes.getDimension(index, this.f22685j);
                        break;
                    case 10:
                        this.f22686k = typedArrayObtainStyledAttributes.getDimension(index, this.f22686k);
                        break;
                    case 11:
                        this.f22687l = true;
                        this.f22688m = typedArrayObtainStyledAttributes.getDimension(index, this.f22688m);
                        break;
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        f22589e = sparseIntArray;
        sparseIntArray.append(i.f22986u0, 25);
        f22589e.append(i.f22993v0, 26);
        f22589e.append(i.f23006x0, 29);
        f22589e.append(i.f23012y0, 30);
        f22589e.append(i.f22714E0, 36);
        f22589e.append(i.f22708D0, 35);
        f22589e.append(i.f22860c0, 4);
        f22589e.append(i.f22853b0, 3);
        f22589e.append(i.f22839Z, 1);
        f22589e.append(i.f22762M0, 6);
        f22589e.append(i.f22768N0, 7);
        f22589e.append(i.f22909j0, 17);
        f22589e.append(i.f22916k0, 18);
        f22589e.append(i.f22923l0, 19);
        f22589e.append(i.f22971s, 27);
        f22589e.append(i.f23018z0, 32);
        f22589e.append(i.f22690A0, 33);
        f22589e.append(i.f22902i0, 10);
        f22589e.append(i.f22895h0, 9);
        f22589e.append(i.f22786Q0, 13);
        f22589e.append(i.f22804T0, 16);
        f22589e.append(i.f22792R0, 14);
        f22589e.append(i.f22774O0, 11);
        f22589e.append(i.f22798S0, 15);
        f22589e.append(i.f22780P0, 12);
        f22589e.append(i.f22732H0, 40);
        f22589e.append(i.f22972s0, 39);
        f22589e.append(i.f22965r0, 41);
        f22589e.append(i.f22726G0, 42);
        f22589e.append(i.f22958q0, 20);
        f22589e.append(i.f22720F0, 37);
        f22589e.append(i.f22888g0, 5);
        f22589e.append(i.f22979t0, 82);
        f22589e.append(i.f22702C0, 82);
        f22589e.append(i.f23000w0, 82);
        f22589e.append(i.f22846a0, 82);
        f22589e.append(i.f22833Y, 82);
        f22589e.append(i.f23005x, 24);
        f22589e.append(i.f23017z, 28);
        f22589e.append(i.f22755L, 31);
        f22589e.append(i.f22761M, 8);
        f22589e.append(i.f23011y, 34);
        f22589e.append(i.f22689A, 2);
        f22589e.append(i.f22992v, 23);
        f22589e.append(i.f22999w, 21);
        f22589e.append(i.f22985u, 22);
        f22589e.append(i.f22695B, 43);
        f22589e.append(i.f22773O, 44);
        f22589e.append(i.f22743J, 45);
        f22589e.append(i.f22749K, 46);
        f22589e.append(i.f22737I, 60);
        f22589e.append(i.f22725G, 47);
        f22589e.append(i.f22731H, 48);
        f22589e.append(i.f22701C, 49);
        f22589e.append(i.f22707D, 50);
        f22589e.append(i.f22713E, 51);
        f22589e.append(i.f22719F, 52);
        f22589e.append(i.f22767N, 53);
        f22589e.append(i.f22738I0, 54);
        f22589e.append(i.f22930m0, 55);
        f22589e.append(i.f22744J0, 56);
        f22589e.append(i.f22937n0, 57);
        f22589e.append(i.f22750K0, 58);
        f22589e.append(i.f22944o0, 59);
        f22589e.append(i.f22867d0, 61);
        f22589e.append(i.f22881f0, 62);
        f22589e.append(i.f22874e0, 63);
        f22589e.append(i.f22779P, 64);
        f22589e.append(i.f22828X0, 65);
        f22589e.append(i.f22815V, 66);
        f22589e.append(i.f22834Y0, 67);
        f22589e.append(i.f22816V0, 79);
        f22589e.append(i.f22978t, 38);
        f22589e.append(i.f22810U0, 68);
        f22589e.append(i.f22756L0, 69);
        f22589e.append(i.f22951p0, 70);
        f22589e.append(i.f22803T, 71);
        f22589e.append(i.f22791R, 72);
        f22589e.append(i.f22797S, 73);
        f22589e.append(i.f22809U, 74);
        f22589e.append(i.f22785Q, 75);
        f22589e.append(i.f22822W0, 76);
        f22589e.append(i.f22696B0, 77);
        f22589e.append(i.f22840Z0, 78);
        f22589e.append(i.f22827X, 80);
        f22589e.append(i.f22821W, 81);
    }

    private int[] h(View view, String str) {
        int iIntValue;
        Object objF;
        String[] strArrSplit = str.split(",");
        Context context = view.getContext();
        int[] iArr = new int[strArrSplit.length];
        int i10 = 0;
        int i11 = 0;
        while (i10 < strArrSplit.length) {
            String strTrim = strArrSplit[i10].trim();
            try {
                iIntValue = h.class.getField(strTrim).getInt(null);
            } catch (Exception unused) {
                iIntValue = 0;
            }
            if (iIntValue == 0) {
                iIntValue = context.getResources().getIdentifier(strTrim, "id", context.getPackageName());
            }
            if (iIntValue == 0 && view.isInEditMode() && (view.getParent() instanceof ConstraintLayout) && (objF = ((ConstraintLayout) view.getParent()).f(0, strTrim)) != null && (objF instanceof Integer)) {
                iIntValue = ((Integer) objF).intValue();
            }
            iArr[i11] = iIntValue;
            i10++;
            i11++;
        }
        return i11 != strArrSplit.length ? Arrays.copyOf(iArr, i11) : iArr;
    }

    private a i(Context context, AttributeSet attributeSet) {
        a aVar = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.f22964r);
        n(context, aVar, typedArrayObtainStyledAttributes);
        typedArrayObtainStyledAttributes.recycle();
        return aVar;
    }

    private a j(int i10) {
        if (!this.f22592c.containsKey(Integer.valueOf(i10))) {
            this.f22592c.put(Integer.valueOf(i10), new a());
        }
        return (a) this.f22592c.get(Integer.valueOf(i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int m(TypedArray typedArray, int i10, int i11) {
        int resourceId = typedArray.getResourceId(i10, i11);
        return resourceId == -1 ? typedArray.getInt(i10, -1) : resourceId;
    }

    private void n(Context context, a aVar, TypedArray typedArray) {
        int indexCount = typedArray.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = typedArray.getIndex(i10);
            if (index != i.f22978t && i.f22755L != index && i.f22761M != index) {
                aVar.f22595c.f22663a = true;
                aVar.f22596d.f22628b = true;
                aVar.f22594b.f22670a = true;
                aVar.f22597e.f22676a = true;
            }
            switch (f22589e.get(index)) {
                case 1:
                    b bVar = aVar.f22596d;
                    bVar.f22651p = m(typedArray, index, bVar.f22651p);
                    break;
                case 2:
                    b bVar2 = aVar.f22596d;
                    bVar2.f22606G = typedArray.getDimensionPixelSize(index, bVar2.f22606G);
                    break;
                case 3:
                    b bVar3 = aVar.f22596d;
                    bVar3.f22650o = m(typedArray, index, bVar3.f22650o);
                    break;
                case 4:
                    b bVar4 = aVar.f22596d;
                    bVar4.f22649n = m(typedArray, index, bVar4.f22649n);
                    break;
                case 5:
                    aVar.f22596d.f22658w = typedArray.getString(index);
                    break;
                case 6:
                    b bVar5 = aVar.f22596d;
                    bVar5.f22600A = typedArray.getDimensionPixelOffset(index, bVar5.f22600A);
                    break;
                case 7:
                    b bVar6 = aVar.f22596d;
                    bVar6.f22601B = typedArray.getDimensionPixelOffset(index, bVar6.f22601B);
                    break;
                case 8:
                    b bVar7 = aVar.f22596d;
                    bVar7.f22607H = typedArray.getDimensionPixelSize(index, bVar7.f22607H);
                    break;
                case 9:
                    b bVar8 = aVar.f22596d;
                    bVar8.f22655t = m(typedArray, index, bVar8.f22655t);
                    break;
                case 10:
                    b bVar9 = aVar.f22596d;
                    bVar9.f22654s = m(typedArray, index, bVar9.f22654s);
                    break;
                case 11:
                    b bVar10 = aVar.f22596d;
                    bVar10.f22612M = typedArray.getDimensionPixelSize(index, bVar10.f22612M);
                    break;
                case 12:
                    b bVar11 = aVar.f22596d;
                    bVar11.f22613N = typedArray.getDimensionPixelSize(index, bVar11.f22613N);
                    break;
                case 13:
                    b bVar12 = aVar.f22596d;
                    bVar12.f22609J = typedArray.getDimensionPixelSize(index, bVar12.f22609J);
                    break;
                case 14:
                    b bVar13 = aVar.f22596d;
                    bVar13.f22611L = typedArray.getDimensionPixelSize(index, bVar13.f22611L);
                    break;
                case 15:
                    b bVar14 = aVar.f22596d;
                    bVar14.f22614O = typedArray.getDimensionPixelSize(index, bVar14.f22614O);
                    break;
                case 16:
                    b bVar15 = aVar.f22596d;
                    bVar15.f22610K = typedArray.getDimensionPixelSize(index, bVar15.f22610K);
                    break;
                case 17:
                    b bVar16 = aVar.f22596d;
                    bVar16.f22634e = typedArray.getDimensionPixelOffset(index, bVar16.f22634e);
                    break;
                case 18:
                    b bVar17 = aVar.f22596d;
                    bVar17.f22636f = typedArray.getDimensionPixelOffset(index, bVar17.f22636f);
                    break;
                case 19:
                    b bVar18 = aVar.f22596d;
                    bVar18.f22638g = typedArray.getFloat(index, bVar18.f22638g);
                    break;
                case 20:
                    b bVar19 = aVar.f22596d;
                    bVar19.f22656u = typedArray.getFloat(index, bVar19.f22656u);
                    break;
                case 21:
                    b bVar20 = aVar.f22596d;
                    bVar20.f22632d = typedArray.getLayoutDimension(index, bVar20.f22632d);
                    break;
                case 22:
                    d dVar = aVar.f22594b;
                    dVar.f22671b = typedArray.getInt(index, dVar.f22671b);
                    d dVar2 = aVar.f22594b;
                    dVar2.f22671b = f22588d[dVar2.f22671b];
                    break;
                case 23:
                    b bVar21 = aVar.f22596d;
                    bVar21.f22630c = typedArray.getLayoutDimension(index, bVar21.f22630c);
                    break;
                case 24:
                    b bVar22 = aVar.f22596d;
                    bVar22.f22603D = typedArray.getDimensionPixelSize(index, bVar22.f22603D);
                    break;
                case 25:
                    b bVar23 = aVar.f22596d;
                    bVar23.f22640h = m(typedArray, index, bVar23.f22640h);
                    break;
                case 26:
                    b bVar24 = aVar.f22596d;
                    bVar24.f22642i = m(typedArray, index, bVar24.f22642i);
                    break;
                case 27:
                    b bVar25 = aVar.f22596d;
                    bVar25.f22602C = typedArray.getInt(index, bVar25.f22602C);
                    break;
                case 28:
                    b bVar26 = aVar.f22596d;
                    bVar26.f22604E = typedArray.getDimensionPixelSize(index, bVar26.f22604E);
                    break;
                case 29:
                    b bVar27 = aVar.f22596d;
                    bVar27.f22644j = m(typedArray, index, bVar27.f22644j);
                    break;
                case 30:
                    b bVar28 = aVar.f22596d;
                    bVar28.f22646k = m(typedArray, index, bVar28.f22646k);
                    break;
                case 31:
                    b bVar29 = aVar.f22596d;
                    bVar29.f22608I = typedArray.getDimensionPixelSize(index, bVar29.f22608I);
                    break;
                case 32:
                    b bVar30 = aVar.f22596d;
                    bVar30.f22652q = m(typedArray, index, bVar30.f22652q);
                    break;
                case 33:
                    b bVar31 = aVar.f22596d;
                    bVar31.f22653r = m(typedArray, index, bVar31.f22653r);
                    break;
                case 34:
                    b bVar32 = aVar.f22596d;
                    bVar32.f22605F = typedArray.getDimensionPixelSize(index, bVar32.f22605F);
                    break;
                case 35:
                    b bVar33 = aVar.f22596d;
                    bVar33.f22648m = m(typedArray, index, bVar33.f22648m);
                    break;
                case 36:
                    b bVar34 = aVar.f22596d;
                    bVar34.f22647l = m(typedArray, index, bVar34.f22647l);
                    break;
                case 37:
                    b bVar35 = aVar.f22596d;
                    bVar35.f22657v = typedArray.getFloat(index, bVar35.f22657v);
                    break;
                case 38:
                    aVar.f22593a = typedArray.getResourceId(index, aVar.f22593a);
                    break;
                case 39:
                    b bVar36 = aVar.f22596d;
                    bVar36.f22616Q = typedArray.getFloat(index, bVar36.f22616Q);
                    break;
                case 40:
                    b bVar37 = aVar.f22596d;
                    bVar37.f22615P = typedArray.getFloat(index, bVar37.f22615P);
                    break;
                case 41:
                    b bVar38 = aVar.f22596d;
                    bVar38.f22617R = typedArray.getInt(index, bVar38.f22617R);
                    break;
                case 42:
                    b bVar39 = aVar.f22596d;
                    bVar39.f22618S = typedArray.getInt(index, bVar39.f22618S);
                    break;
                case 43:
                    d dVar3 = aVar.f22594b;
                    dVar3.f22673d = typedArray.getFloat(index, dVar3.f22673d);
                    break;
                case 44:
                    C0277e c0277e = aVar.f22597e;
                    c0277e.f22687l = true;
                    c0277e.f22688m = typedArray.getDimension(index, c0277e.f22688m);
                    break;
                case 45:
                    C0277e c0277e2 = aVar.f22597e;
                    c0277e2.f22678c = typedArray.getFloat(index, c0277e2.f22678c);
                    break;
                case 46:
                    C0277e c0277e3 = aVar.f22597e;
                    c0277e3.f22679d = typedArray.getFloat(index, c0277e3.f22679d);
                    break;
                case 47:
                    C0277e c0277e4 = aVar.f22597e;
                    c0277e4.f22680e = typedArray.getFloat(index, c0277e4.f22680e);
                    break;
                case 48:
                    C0277e c0277e5 = aVar.f22597e;
                    c0277e5.f22681f = typedArray.getFloat(index, c0277e5.f22681f);
                    break;
                case 49:
                    C0277e c0277e6 = aVar.f22597e;
                    c0277e6.f22682g = typedArray.getDimension(index, c0277e6.f22682g);
                    break;
                case 50:
                    C0277e c0277e7 = aVar.f22597e;
                    c0277e7.f22683h = typedArray.getDimension(index, c0277e7.f22683h);
                    break;
                case 51:
                    C0277e c0277e8 = aVar.f22597e;
                    c0277e8.f22684i = typedArray.getDimension(index, c0277e8.f22684i);
                    break;
                case 52:
                    C0277e c0277e9 = aVar.f22597e;
                    c0277e9.f22685j = typedArray.getDimension(index, c0277e9.f22685j);
                    break;
                case 53:
                    C0277e c0277e10 = aVar.f22597e;
                    c0277e10.f22686k = typedArray.getDimension(index, c0277e10.f22686k);
                    break;
                case 54:
                    b bVar40 = aVar.f22596d;
                    bVar40.f22619T = typedArray.getInt(index, bVar40.f22619T);
                    break;
                case 55:
                    b bVar41 = aVar.f22596d;
                    bVar41.f22620U = typedArray.getInt(index, bVar41.f22620U);
                    break;
                case 56:
                    b bVar42 = aVar.f22596d;
                    bVar42.f22621V = typedArray.getDimensionPixelSize(index, bVar42.f22621V);
                    break;
                case 57:
                    b bVar43 = aVar.f22596d;
                    bVar43.f22622W = typedArray.getDimensionPixelSize(index, bVar43.f22622W);
                    break;
                case 58:
                    b bVar44 = aVar.f22596d;
                    bVar44.f22623X = typedArray.getDimensionPixelSize(index, bVar44.f22623X);
                    break;
                case 59:
                    b bVar45 = aVar.f22596d;
                    bVar45.f22624Y = typedArray.getDimensionPixelSize(index, bVar45.f22624Y);
                    break;
                case 60:
                    C0277e c0277e11 = aVar.f22597e;
                    c0277e11.f22677b = typedArray.getFloat(index, c0277e11.f22677b);
                    break;
                case 61:
                    b bVar46 = aVar.f22596d;
                    bVar46.f22659x = m(typedArray, index, bVar46.f22659x);
                    break;
                case 62:
                    b bVar47 = aVar.f22596d;
                    bVar47.f22660y = typedArray.getDimensionPixelSize(index, bVar47.f22660y);
                    break;
                case 63:
                    b bVar48 = aVar.f22596d;
                    bVar48.f22661z = typedArray.getFloat(index, bVar48.f22661z);
                    break;
                case 64:
                    c cVar = aVar.f22595c;
                    cVar.f22664b = m(typedArray, index, cVar.f22664b);
                    break;
                case 65:
                    if (typedArray.peekValue(index).type == 3) {
                        aVar.f22595c.f22665c = typedArray.getString(index);
                    } else {
                        aVar.f22595c.f22665c = R0.a.f9867c[typedArray.getInteger(index, 0)];
                    }
                    break;
                case 66:
                    aVar.f22595c.f22667e = typedArray.getInt(index, 0);
                    break;
                case 67:
                    c cVar2 = aVar.f22595c;
                    cVar2.f22669g = typedArray.getFloat(index, cVar2.f22669g);
                    break;
                case 68:
                    d dVar4 = aVar.f22594b;
                    dVar4.f22674e = typedArray.getFloat(index, dVar4.f22674e);
                    break;
                case 69:
                    aVar.f22596d.f22625Z = typedArray.getFloat(index, 1.0f);
                    break;
                case 70:
                    aVar.f22596d.f22627a0 = typedArray.getFloat(index, 1.0f);
                    break;
                case 71:
                    Log.e("ConstraintSet", "CURRENTLY UNSUPPORTED");
                    break;
                case 72:
                    b bVar49 = aVar.f22596d;
                    bVar49.f22629b0 = typedArray.getInt(index, bVar49.f22629b0);
                    break;
                case 73:
                    b bVar50 = aVar.f22596d;
                    bVar50.f22631c0 = typedArray.getDimensionPixelSize(index, bVar50.f22631c0);
                    break;
                case 74:
                    aVar.f22596d.f22637f0 = typedArray.getString(index);
                    break;
                case 75:
                    b bVar51 = aVar.f22596d;
                    bVar51.f22645j0 = typedArray.getBoolean(index, bVar51.f22645j0);
                    break;
                case 76:
                    c cVar3 = aVar.f22595c;
                    cVar3.f22666d = typedArray.getInt(index, cVar3.f22666d);
                    break;
                case 77:
                    aVar.f22596d.f22639g0 = typedArray.getString(index);
                    break;
                case 78:
                    d dVar5 = aVar.f22594b;
                    dVar5.f22672c = typedArray.getInt(index, dVar5.f22672c);
                    break;
                case 79:
                    c cVar4 = aVar.f22595c;
                    cVar4.f22668f = typedArray.getFloat(index, cVar4.f22668f);
                    break;
                case 80:
                    b bVar52 = aVar.f22596d;
                    bVar52.f22641h0 = typedArray.getBoolean(index, bVar52.f22641h0);
                    break;
                case 81:
                    b bVar53 = aVar.f22596d;
                    bVar53.f22643i0 = typedArray.getBoolean(index, bVar53.f22643i0);
                    break;
                case 82:
                    Log.w("ConstraintSet", "unused attribute 0x" + Integer.toHexString(index) + "   " + f22589e.get(index));
                    break;
                default:
                    Log.w("ConstraintSet", "Unknown attribute 0x" + Integer.toHexString(index) + "   " + f22589e.get(index));
                    break;
            }
        }
    }

    public void c(ConstraintLayout constraintLayout) {
        d(constraintLayout, true);
        constraintLayout.setConstraintSet(null);
        constraintLayout.requestLayout();
    }

    void d(ConstraintLayout constraintLayout, boolean z10) {
        int childCount = constraintLayout.getChildCount();
        HashSet<Integer> hashSet = new HashSet(this.f22592c.keySet());
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            int id2 = childAt.getId();
            if (!this.f22592c.containsKey(Integer.valueOf(id2))) {
                Log.w("ConstraintSet", "id unknown " + S0.a.a(childAt));
            } else {
                if (this.f22591b && id2 == -1) {
                    throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
                }
                if (id2 != -1) {
                    if (this.f22592c.containsKey(Integer.valueOf(id2))) {
                        hashSet.remove(Integer.valueOf(id2));
                        a aVar = (a) this.f22592c.get(Integer.valueOf(id2));
                        if (childAt instanceof androidx.constraintlayout.widget.a) {
                            aVar.f22596d.f22633d0 = 1;
                        }
                        int i11 = aVar.f22596d.f22633d0;
                        if (i11 != -1 && i11 == 1) {
                            androidx.constraintlayout.widget.a aVar2 = (androidx.constraintlayout.widget.a) childAt;
                            aVar2.setId(id2);
                            aVar2.setType(aVar.f22596d.f22629b0);
                            aVar2.setMargin(aVar.f22596d.f22631c0);
                            aVar2.setAllowsGoneWidget(aVar.f22596d.f22645j0);
                            b bVar = aVar.f22596d;
                            int[] iArr = bVar.f22635e0;
                            if (iArr != null) {
                                aVar2.setReferencedIds(iArr);
                            } else {
                                String str = bVar.f22637f0;
                                if (str != null) {
                                    bVar.f22635e0 = h(aVar2, str);
                                    aVar2.setReferencedIds(aVar.f22596d.f22635e0);
                                }
                            }
                        }
                        ConstraintLayout.b bVar2 = (ConstraintLayout.b) childAt.getLayoutParams();
                        bVar2.a();
                        aVar.b(bVar2);
                        if (z10) {
                            androidx.constraintlayout.widget.b.c(childAt, aVar.f22598f);
                        }
                        childAt.setLayoutParams(bVar2);
                        d dVar = aVar.f22594b;
                        if (dVar.f22672c == 0) {
                            childAt.setVisibility(dVar.f22671b);
                        }
                        childAt.setAlpha(aVar.f22594b.f22673d);
                        childAt.setRotation(aVar.f22597e.f22677b);
                        childAt.setRotationX(aVar.f22597e.f22678c);
                        childAt.setRotationY(aVar.f22597e.f22679d);
                        childAt.setScaleX(aVar.f22597e.f22680e);
                        childAt.setScaleY(aVar.f22597e.f22681f);
                        if (!Float.isNaN(aVar.f22597e.f22682g)) {
                            childAt.setPivotX(aVar.f22597e.f22682g);
                        }
                        if (!Float.isNaN(aVar.f22597e.f22683h)) {
                            childAt.setPivotY(aVar.f22597e.f22683h);
                        }
                        childAt.setTranslationX(aVar.f22597e.f22684i);
                        childAt.setTranslationY(aVar.f22597e.f22685j);
                        childAt.setTranslationZ(aVar.f22597e.f22686k);
                        C0277e c0277e = aVar.f22597e;
                        if (c0277e.f22687l) {
                            childAt.setElevation(c0277e.f22688m);
                        }
                    } else {
                        Log.v("ConstraintSet", "WARNING NO CONSTRAINTS for view " + id2);
                    }
                }
            }
        }
        for (Integer num : hashSet) {
            a aVar3 = (a) this.f22592c.get(num);
            int i12 = aVar3.f22596d.f22633d0;
            if (i12 != -1 && i12 == 1) {
                androidx.constraintlayout.widget.a aVar4 = new androidx.constraintlayout.widget.a(constraintLayout.getContext());
                aVar4.setId(num.intValue());
                b bVar3 = aVar3.f22596d;
                int[] iArr2 = bVar3.f22635e0;
                if (iArr2 != null) {
                    aVar4.setReferencedIds(iArr2);
                } else {
                    String str2 = bVar3.f22637f0;
                    if (str2 != null) {
                        bVar3.f22635e0 = h(aVar4, str2);
                        aVar4.setReferencedIds(aVar3.f22596d.f22635e0);
                    }
                }
                aVar4.setType(aVar3.f22596d.f22629b0);
                aVar4.setMargin(aVar3.f22596d.f22631c0);
                ConstraintLayout.b bVarGenerateDefaultLayoutParams = constraintLayout.generateDefaultLayoutParams();
                aVar4.m();
                aVar3.b(bVarGenerateDefaultLayoutParams);
                constraintLayout.addView(aVar4, bVarGenerateDefaultLayoutParams);
            }
            if (aVar3.f22596d.f22626a) {
                View gVar = new g(constraintLayout.getContext());
                gVar.setId(num.intValue());
                ConstraintLayout.b bVarGenerateDefaultLayoutParams2 = constraintLayout.generateDefaultLayoutParams();
                aVar3.b(bVarGenerateDefaultLayoutParams2);
                constraintLayout.addView(gVar, bVarGenerateDefaultLayoutParams2);
            }
        }
    }

    public void e(Context context, int i10) {
        f((ConstraintLayout) LayoutInflater.from(context).inflate(i10, (ViewGroup) null));
    }

    public void f(ConstraintLayout constraintLayout) {
        int childCount = constraintLayout.getChildCount();
        this.f22592c.clear();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            ConstraintLayout.b bVar = (ConstraintLayout.b) childAt.getLayoutParams();
            int id2 = childAt.getId();
            if (this.f22591b && id2 == -1) {
                throw new RuntimeException("All children of ConstraintLayout must have ids to use ConstraintSet");
            }
            if (!this.f22592c.containsKey(Integer.valueOf(id2))) {
                this.f22592c.put(Integer.valueOf(id2), new a());
            }
            a aVar = (a) this.f22592c.get(Integer.valueOf(id2));
            aVar.f22598f = androidx.constraintlayout.widget.b.a(this.f22590a, childAt);
            aVar.d(id2, bVar);
            aVar.f22594b.f22671b = childAt.getVisibility();
            aVar.f22594b.f22673d = childAt.getAlpha();
            aVar.f22597e.f22677b = childAt.getRotation();
            aVar.f22597e.f22678c = childAt.getRotationX();
            aVar.f22597e.f22679d = childAt.getRotationY();
            aVar.f22597e.f22680e = childAt.getScaleX();
            aVar.f22597e.f22681f = childAt.getScaleY();
            float pivotX = childAt.getPivotX();
            float pivotY = childAt.getPivotY();
            if (pivotX != 0.0d || pivotY != 0.0d) {
                C0277e c0277e = aVar.f22597e;
                c0277e.f22682g = pivotX;
                c0277e.f22683h = pivotY;
            }
            aVar.f22597e.f22684i = childAt.getTranslationX();
            aVar.f22597e.f22685j = childAt.getTranslationY();
            aVar.f22597e.f22686k = childAt.getTranslationZ();
            C0277e c0277e2 = aVar.f22597e;
            if (c0277e2.f22687l) {
                c0277e2.f22688m = childAt.getElevation();
            }
            if (childAt instanceof androidx.constraintlayout.widget.a) {
                androidx.constraintlayout.widget.a aVar2 = (androidx.constraintlayout.widget.a) childAt;
                aVar.f22596d.f22645j0 = aVar2.n();
                aVar.f22596d.f22635e0 = aVar2.getReferencedIds();
                aVar.f22596d.f22629b0 = aVar2.getType();
                aVar.f22596d.f22631c0 = aVar2.getMargin();
            }
        }
    }

    public void g(int i10, int i11, int i12, float f10) {
        b bVar = j(i10).f22596d;
        bVar.f22659x = i11;
        bVar.f22660y = i12;
        bVar.f22661z = f10;
    }

    public void k(Context context, int i10) {
        XmlResourceParser xml = context.getResources().getXml(i10);
        try {
            for (int eventType = xml.getEventType(); eventType != 1; eventType = xml.next()) {
                if (eventType == 0) {
                    xml.getName();
                } else if (eventType == 2) {
                    String name = xml.getName();
                    a aVarI = i(context, Xml.asAttributeSet(xml));
                    if (name.equalsIgnoreCase("Guideline")) {
                        aVarI.f22596d.f22626a = true;
                    }
                    this.f22592c.put(Integer.valueOf(aVarI.f22593a), aVarI);
                }
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0096  */
    public void l(Context context, XmlPullParser xmlPullParser) {
        try {
            int eventType = xmlPullParser.getEventType();
            a aVarI = null;
            while (eventType != 1) {
                if (eventType != 0) {
                    if (eventType == 2) {
                        switch (xmlPullParser.getName()) {
                            case "Constraint":
                                aVarI = i(context, Xml.asAttributeSet(xmlPullParser));
                                break;
                            case "Guideline":
                                aVarI = i(context, Xml.asAttributeSet(xmlPullParser));
                                b bVar = aVarI.f22596d;
                                bVar.f22626a = true;
                                bVar.f22628b = true;
                                break;
                            case "Barrier":
                                aVarI = i(context, Xml.asAttributeSet(xmlPullParser));
                                aVarI.f22596d.f22633d0 = 1;
                                break;
                            case "PropertySet":
                                if (aVarI == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                aVarI.f22594b.b(context, Xml.asAttributeSet(xmlPullParser));
                                break;
                                break;
                            case "Transform":
                                if (aVarI == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                aVarI.f22597e.b(context, Xml.asAttributeSet(xmlPullParser));
                                break;
                                break;
                            case "Layout":
                                if (aVarI == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                aVarI.f22596d.b(context, Xml.asAttributeSet(xmlPullParser));
                                break;
                                break;
                            case "Motion":
                                if (aVarI == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                aVarI.f22595c.b(context, Xml.asAttributeSet(xmlPullParser));
                                break;
                                break;
                            case "CustomAttribute":
                                if (aVarI == null) {
                                    throw new RuntimeException("XML parser error must be within a Constraint " + xmlPullParser.getLineNumber());
                                }
                                androidx.constraintlayout.widget.b.b(context, xmlPullParser, aVarI.f22598f);
                                break;
                                break;
                        }
                    } else if (eventType != 3) {
                        continue;
                    } else {
                        String name = xmlPullParser.getName();
                        if ("ConstraintSet".equals(name)) {
                            return;
                        }
                        if (name.equalsIgnoreCase("Constraint")) {
                            this.f22592c.put(Integer.valueOf(aVarI.f22593a), aVarI);
                            aVarI = null;
                        }
                    }
                } else {
                    xmlPullParser.getName();
                }
                eventType = xmlPullParser.next();
            }
        } catch (IOException e10) {
            e10.printStackTrace();
        } catch (XmlPullParserException e11) {
            e11.printStackTrace();
        }
    }
}
