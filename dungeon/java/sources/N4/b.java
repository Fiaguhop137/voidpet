package N4;

import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private f f7304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private u f7305b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f7306c;

    static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f7307a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f7308b;

        static {
            int[] iArr = new int[j.values().length];
            f7308b = iArr;
            try {
                iArr[j.first_child.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7308b[j.last_child.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7308b[j.only_child.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7308b[j.first_of_type.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7308b[j.last_of_type.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7308b[j.only_of_type.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f7308b[j.root.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f7308b[j.empty.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f7308b[j.nth_child.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f7308b[j.nth_last_child.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f7308b[j.nth_of_type.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                f7308b[j.nth_last_of_type.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                f7308b[j.not.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                f7308b[j.target.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                f7308b[j.lang.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                f7308b[j.link.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                f7308b[j.visited.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                f7308b[j.hover.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                f7308b[j.active.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                f7308b[j.focus.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                f7308b[j.enabled.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                f7308b[j.disabled.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                f7308b[j.checked.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                f7308b[j.indeterminate.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            int[] iArr2 = new int[c.values().length];
            f7307a = iArr2;
            try {
                iArr2[c.EQUALS.ordinal()] = 1;
            } catch (NoSuchFieldError unused25) {
            }
            try {
                f7307a[c.INCLUDES.ordinal()] = 2;
            } catch (NoSuchFieldError unused26) {
            }
            try {
                f7307a[c.DASHMATCH.ordinal()] = 3;
            } catch (NoSuchFieldError unused27) {
            }
        }
    }

    /* JADX INFO: renamed from: N4.b$b, reason: collision with other inner class name */
    private static class C0130b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f7309a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final c f7310b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final String f7311c;

        C0130b(String str, c cVar, String str2) {
            this.f7309a = str;
            this.f7310b = cVar;
            this.f7311c = str2;
        }
    }

    private enum c {
        EXISTS,
        EQUALS,
        INCLUDES,
        DASHMATCH
    }

    private static class d extends N4.k.i {

        private static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f7317a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f7318b;

            a(int i10, int i11) {
                this.f7317a = i10;
                this.f7318b = i11;
            }
        }

        d(String str) {
            super(str.replaceAll("(?s)/\\*.*?\\*/", ""));
        }

        private int C(int i10) {
            if (i10 >= 48 && i10 <= 57) {
                return i10 - 48;
            }
            if (i10 >= 65 && i10 <= 70) {
                return i10 - 55;
            }
            if (i10 < 97 || i10 > 102) {
                return -1;
            }
            return i10 - 87;
        }

        private a D() {
            N4.c cVarC;
            a aVar;
            if (h()) {
                return null;
            }
            int i10 = this.f7846b;
            if (!f('(')) {
                return null;
            }
            A();
            int i11 = 1;
            if (g("odd")) {
                aVar = new a(2, 1);
            } else {
                if (g("even")) {
                    aVar = new a(2, 0);
                } else {
                    int i12 = (!f('+') && f('-')) ? -1 : 1;
                    N4.c cVarC2 = N4.c.c(this.f7845a, this.f7846b, this.f7847c, false);
                    if (cVarC2 != null) {
                        this.f7846b = cVarC2.a();
                    }
                    if (f('n') || f('N')) {
                        if (cVarC2 == null) {
                            cVarC2 = new N4.c(1L, this.f7846b);
                        }
                        A();
                        boolean zF = f('+');
                        if (!zF && (zF = f('-'))) {
                            i11 = -1;
                        }
                        if (zF) {
                            A();
                            cVarC = N4.c.c(this.f7845a, this.f7846b, this.f7847c, false);
                            if (cVarC == null) {
                                this.f7846b = i10;
                                return null;
                            }
                            this.f7846b = cVarC.a();
                            int i13 = i11;
                            i11 = i12;
                            i12 = i13;
                        } else {
                            int i14 = i11;
                            i11 = i12;
                            i12 = i14;
                            cVarC = null;
                        }
                    } else {
                        cVarC = cVarC2;
                        cVarC2 = null;
                    }
                    aVar = new a(cVarC2 == null ? 0 : i11 * cVarC2.d(), cVarC != null ? i12 * cVarC.d() : 0);
                }
            }
            A();
            if (f(')')) {
                return aVar;
            }
            this.f7846b = i10;
            return null;
        }

        private String E() {
            if (h()) {
                return null;
            }
            String strQ = q();
            return strQ != null ? strQ : H();
        }

        private List G() {
            if (h()) {
                return null;
            }
            int i10 = this.f7846b;
            if (!f('(')) {
                return null;
            }
            A();
            ArrayList arrayList = null;
            do {
                String strH = H();
                if (strH == null) {
                    this.f7846b = i10;
                    return null;
                }
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(strH);
                A();
            } while (z());
            if (f(')')) {
                return arrayList;
            }
            this.f7846b = i10;
            return null;
        }

        private List K() {
            List list;
            List list2;
            if (h()) {
                return null;
            }
            int i10 = this.f7846b;
            if (!f('(')) {
                return null;
            }
            A();
            List listL = L();
            if (listL == null) {
                this.f7846b = i10;
                return null;
            }
            if (!f(')')) {
                this.f7846b = i10;
                return null;
            }
            Iterator it = listL.iterator();
            while (it.hasNext() && (list = ((s) it.next()).f7376a) != null) {
                Iterator it2 = list.iterator();
                while (it2.hasNext() && (list2 = ((t) it2.next()).f7381d) != null) {
                    Iterator it3 = list2.iterator();
                    while (it3.hasNext()) {
                        if (((g) it3.next()) instanceof k) {
                            return null;
                        }
                    }
                }
            }
            return listL;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public List L() {
            if (h()) {
                return null;
            }
            ArrayList arrayList = new ArrayList(1);
            s sVar = new s(null);
            while (!h() && M(sVar)) {
                if (z()) {
                    arrayList.add(sVar);
                    sVar = new s(null);
                }
            }
            if (!sVar.f()) {
                arrayList.add(sVar);
            }
            return arrayList;
        }

        private void O(s sVar, t tVar) throws N4.a {
            g gVar;
            g hVar;
            g gVar2;
            String strH = H();
            if (strH == null) {
                throw new N4.a("Invalid pseudo class");
            }
            j jVarE = j.e(strH);
            switch (a.f7308b[jVarE.ordinal()]) {
                case 1:
                    g hVar2 = new h(0, 1, true, false, null);
                    sVar.b();
                    gVar2 = hVar2;
                    gVar = gVar2;
                    tVar.b(gVar);
                    return;
                case 2:
                    g hVar3 = new h(0, 1, false, false, null);
                    sVar.b();
                    gVar = hVar3;
                    tVar.b(gVar);
                    return;
                case 3:
                    g mVar = new m(false, null);
                    sVar.b();
                    gVar = mVar;
                    tVar.b(gVar);
                    return;
                case 4:
                    hVar = new h(0, 1, true, true, tVar.f7379b);
                    sVar.b();
                    gVar = hVar;
                    tVar.b(gVar);
                    return;
                case 5:
                    g hVar4 = new h(0, 1, false, true, tVar.f7379b);
                    sVar.b();
                    gVar = hVar4;
                    tVar.b(gVar);
                    return;
                case 6:
                    g mVar2 = new m(true, tVar.f7379b);
                    sVar.b();
                    gVar = mVar2;
                    tVar.b(gVar);
                    return;
                case 7:
                    g nVar = new n(null);
                    sVar.b();
                    gVar = nVar;
                    tVar.b(gVar);
                    return;
                case 8:
                    g iVar = new i(null);
                    sVar.b();
                    gVar = iVar;
                    tVar.b(gVar);
                    return;
                case 9:
                case 10:
                case 11:
                case 12:
                    boolean z10 = jVarE == j.nth_child || jVarE == j.nth_of_type;
                    boolean z11 = jVarE == j.nth_of_type || jVarE == j.nth_last_of_type;
                    a aVarD = D();
                    if (aVarD == null) {
                        throw new N4.a("Invalid or missing parameter section for pseudo class: " + strH);
                    }
                    hVar = new h(aVarD.f7317a, aVarD.f7318b, z10, z11, tVar.f7379b);
                    sVar.b();
                    gVar = hVar;
                    tVar.b(gVar);
                    return;
                case 13:
                    List listK = K();
                    if (listK == null) {
                        throw new N4.a("Invalid or missing parameter section for pseudo class: " + strH);
                    }
                    k kVar = new k(listK);
                    sVar.f7377b = kVar.b();
                    gVar2 = kVar;
                    gVar = gVar2;
                    tVar.b(gVar);
                    return;
                case 14:
                    g oVar = new o(null);
                    sVar.b();
                    gVar = oVar;
                    tVar.b(gVar);
                    return;
                case 15:
                    G();
                    g lVar = new l(strH);
                    sVar.b();
                    gVar = lVar;
                    tVar.b(gVar);
                    return;
                case 16:
                case 17:
                case 18:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                case 24:
                    g lVar2 = new l(strH);
                    sVar.b();
                    gVar = lVar2;
                    tVar.b(gVar);
                    return;
                default:
                    throw new N4.a("Unsupported pseudo class: " + strH);
            }
        }

        private int P() {
            int i10;
            if (h()) {
                return this.f7846b;
            }
            int i11 = this.f7846b;
            int iCharAt = this.f7845a.charAt(i11);
            if (iCharAt == 45) {
                iCharAt = a();
            }
            if ((iCharAt < 65 || iCharAt > 90) && ((iCharAt < 97 || iCharAt > 122) && iCharAt != 95)) {
                i10 = i11;
            } else {
                int iA = a();
                while (true) {
                    if ((iA < 65 || iA > 90) && ((iA < 97 || iA > 122) && !((iA >= 48 && iA <= 57) || iA == 45 || iA == 95))) {
                        break;
                    }
                    iA = a();
                }
                i10 = this.f7846b;
            }
            this.f7846b = i11;
            return i10;
        }

        String F() {
            int iC;
            if (h()) {
                return null;
            }
            char cCharAt = this.f7845a.charAt(this.f7846b);
            if (cCharAt != '\'' && cCharAt != '\"') {
                return null;
            }
            StringBuilder sb2 = new StringBuilder();
            this.f7846b++;
            int iIntValue = l().intValue();
            while (iIntValue != -1 && iIntValue != cCharAt) {
                if (iIntValue == 92) {
                    iIntValue = l().intValue();
                    if (iIntValue != -1) {
                        if (iIntValue == 10 || iIntValue == 13 || iIntValue == 12) {
                            iIntValue = l().intValue();
                        } else {
                            int iC2 = C(iIntValue);
                            if (iC2 != -1) {
                                for (int i10 = 1; i10 <= 5 && (iC = C((iIntValue = l().intValue()))) != -1; i10++) {
                                    iC2 = (iC2 * 16) + iC;
                                }
                                sb2.append((char) iC2);
                            }
                        }
                    }
                }
                sb2.append((char) iIntValue);
                iIntValue = l().intValue();
            }
            return sb2.toString();
        }

        String H() {
            int iP = P();
            int i10 = this.f7846b;
            if (iP == i10) {
                return null;
            }
            String strSubstring = this.f7845a.substring(i10, iP);
            this.f7846b = iP;
            return strSubstring;
        }

        String I() {
            char cCharAt;
            int iC;
            StringBuilder sb2 = new StringBuilder();
            while (!h() && (cCharAt = this.f7845a.charAt(this.f7846b)) != '\'' && cCharAt != '\"' && cCharAt != '(' && cCharAt != ')' && !k(cCharAt) && !Character.isISOControl((int) cCharAt)) {
                this.f7846b++;
                if (cCharAt == '\\') {
                    if (!h()) {
                        String str = this.f7845a;
                        int i10 = this.f7846b;
                        this.f7846b = i10 + 1;
                        cCharAt = str.charAt(i10);
                        if (cCharAt != '\n' && cCharAt != '\r' && cCharAt != '\f') {
                            int iC2 = C(cCharAt);
                            if (iC2 != -1) {
                                for (int i11 = 1; i11 <= 5 && !h() && (iC = C(this.f7845a.charAt(this.f7846b))) != -1; i11++) {
                                    this.f7846b++;
                                    iC2 = (iC2 * 16) + iC;
                                }
                                sb2.append((char) iC2);
                            }
                        }
                    }
                }
                sb2.append(cCharAt);
            }
            if (sb2.length() == 0) {
                return null;
            }
            return sb2.toString();
        }

        String J() {
            if (h()) {
                return null;
            }
            int i10 = this.f7846b;
            int iCharAt = this.f7845a.charAt(i10);
            int i11 = i10;
            while (iCharAt != -1 && iCharAt != 59 && iCharAt != 125 && iCharAt != 33 && !j(iCharAt)) {
                if (!k(iCharAt)) {
                    i11 = this.f7846b + 1;
                }
                iCharAt = a();
            }
            if (this.f7846b > i10) {
                return this.f7845a.substring(i10, i11);
            }
            this.f7846b = i10;
            return null;
        }

        /* JADX WARN: Code duplicated, block: B:13:0x002d  */
        boolean M(s sVar) throws N4.a {
            e eVar;
            t tVar;
            c cVar;
            String strE;
            if (h()) {
                return false;
            }
            int i10 = this.f7846b;
            if (sVar.f()) {
                eVar = null;
            } else if (f('>')) {
                eVar = e.CHILD;
                A();
            } else if (f('+')) {
                eVar = e.FOLLOWS;
                A();
            } else {
                eVar = null;
            }
            if (f('*')) {
                tVar = new t(eVar, null);
            } else {
                String strH = H();
                if (strH != null) {
                    t tVar2 = new t(eVar, strH);
                    sVar.c();
                    tVar = tVar2;
                } else {
                    tVar = null;
                }
            }
            while (!h()) {
                if (!f('.')) {
                    if (!f('#')) {
                        if (!f('[')) {
                            if (!f(':')) {
                                break;
                            }
                            if (tVar == null) {
                                tVar = new t(eVar, null);
                            }
                            O(sVar, tVar);
                        } else {
                            if (tVar == null) {
                                tVar = new t(eVar, null);
                            }
                            A();
                            String strH2 = H();
                            if (strH2 == null) {
                                throw new N4.a("Invalid attribute simpleSelectors");
                            }
                            A();
                            if (f('=')) {
                                cVar = c.EQUALS;
                            } else if (g("~=")) {
                                cVar = c.INCLUDES;
                            } else {
                                cVar = g("|=") ? c.DASHMATCH : null;
                            }
                            if (cVar != null) {
                                A();
                                strE = E();
                                if (strE == null) {
                                    throw new N4.a("Invalid attribute simpleSelectors");
                                }
                                A();
                            } else {
                                strE = null;
                            }
                            if (!f(']')) {
                                throw new N4.a("Invalid attribute simpleSelectors");
                            }
                            if (cVar == null) {
                                cVar = c.EXISTS;
                            }
                            tVar.a(strH2, cVar, strE);
                            sVar.b();
                        }
                    } else {
                        if (tVar == null) {
                            tVar = new t(eVar, null);
                        }
                        String strH3 = H();
                        if (strH3 == null) {
                            throw new N4.a("Invalid \"#id\" simpleSelectors");
                        }
                        tVar.a("id", c.EQUALS, strH3);
                        sVar.d();
                    }
                } else {
                    if (tVar == null) {
                        tVar = new t(eVar, null);
                    }
                    String strH4 = H();
                    if (strH4 == null) {
                        throw new N4.a("Invalid \".class\" simpleSelectors");
                    }
                    tVar.a("class", c.EQUALS, strH4);
                    sVar.b();
                }
            }
            if (tVar != null) {
                sVar.a(tVar);
                return true;
            }
            this.f7846b = i10;
            return false;
        }

        String N() {
            if (h()) {
                return null;
            }
            int i10 = this.f7846b;
            if (!g("url(")) {
                return null;
            }
            A();
            String strF = F();
            if (strF == null) {
                strF = I();
            }
            if (strF == null) {
                this.f7846b = i10;
                return null;
            }
            A();
            if (h() || g(")")) {
                return strF;
            }
            this.f7846b = i10;
            return null;
        }
    }

    private enum e {
        DESCENDANT,
        CHILD,
        FOLLOWS
    }

    enum f {
        all,
        aural,
        braille,
        embossed,
        handheld,
        print,
        projection,
        screen,
        speech,
        tty,
        tv
    }

    private interface g {
        boolean a(q qVar, N4.g.L l10);
    }

    private static class h implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f7335a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f7336b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f7337c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f7338d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private String f7339e;

        h(int i10, int i11, boolean z10, boolean z11, String str) {
            this.f7335a = i10;
            this.f7336b = i11;
            this.f7337c = z10;
            this.f7338d = z11;
            this.f7339e = str;
        }

        @Override // N4.b.g
        public boolean a(q qVar, N4.g.L l10) {
            int i10;
            int i11;
            String strO = (this.f7338d && this.f7339e == null) ? l10.o() : this.f7339e;
            N4.g.J j10 = l10.f7536b;
            if (j10 != null) {
                Iterator it = j10.b().iterator();
                i10 = 0;
                i11 = 0;
                while (it.hasNext()) {
                    N4.g.L l11 = (N4.g.L) ((N4.g.N) it.next());
                    if (l11 == l10) {
                        i10 = i11;
                    }
                    if (strO == null || l11.o().equals(strO)) {
                        i11++;
                    }
                }
            } else {
                i10 = 0;
                i11 = 1;
            }
            int i12 = this.f7337c ? i10 + 1 : i11 - i10;
            int i13 = this.f7335a;
            if (i13 == 0) {
                return i12 == this.f7336b;
            }
            int i14 = this.f7336b;
            return (i12 - i14) % i13 == 0 && (Integer.signum(i12 - i14) == 0 || Integer.signum(i12 - this.f7336b) == Integer.signum(this.f7335a));
        }

        public String toString() {
            String str = this.f7337c ? "" : "last-";
            return this.f7338d ? String.format("nth-%schild(%dn%+d of type <%s>)", str, Integer.valueOf(this.f7335a), Integer.valueOf(this.f7336b), this.f7339e) : String.format("nth-%schild(%dn%+d)", str, Integer.valueOf(this.f7335a), Integer.valueOf(this.f7336b));
        }
    }

    private static class i implements g {
        private i() {
        }

        /* synthetic */ i(a aVar) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // N4.b.g
        public boolean a(q qVar, N4.g.L l10) {
            return !(l10 instanceof N4.g.J) || ((N4.g.J) l10).b().size() == 0;
        }

        public String toString() {
            return "empty";
        }
    }

    private enum j {
        target,
        root,
        nth_child,
        nth_last_child,
        nth_of_type,
        nth_last_of_type,
        first_child,
        last_child,
        first_of_type,
        last_of_type,
        only_child,
        only_of_type,
        empty,
        not,
        lang,
        link,
        visited,
        hover,
        active,
        focus,
        enabled,
        disabled,
        checked,
        indeterminate,
        UNSUPPORTED;


        /* JADX INFO: renamed from: z, reason: collision with root package name */
        private static final Map f7366z = new HashMap();

        static {
            for (j jVar : values()) {
                if (jVar != UNSUPPORTED) {
                    f7366z.put(jVar.name().replace('_', '-'), jVar);
                }
            }
        }

        public static j e(String str) {
            j jVar = (j) f7366z.get(str);
            return jVar != null ? jVar : UNSUPPORTED;
        }
    }

    private static class k implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List f7367a;

        k(List list) {
            this.f7367a = list;
        }

        @Override // N4.b.g
        public boolean a(q qVar, N4.g.L l10) {
            Iterator it = this.f7367a.iterator();
            while (it.hasNext()) {
                if (b.l(qVar, (s) it.next(), l10)) {
                    return false;
                }
            }
            return true;
        }

        int b() {
            Iterator it = this.f7367a.iterator();
            int i10 = Integer.MIN_VALUE;
            while (it.hasNext()) {
                int i11 = ((s) it.next()).f7377b;
                if (i11 > i10) {
                    i10 = i11;
                }
            }
            return i10;
        }

        public String toString() {
            return "not(" + this.f7367a + ")";
        }
    }

    private static class l implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f7368a;

        l(String str) {
            this.f7368a = str;
        }

        @Override // N4.b.g
        public boolean a(q qVar, N4.g.L l10) {
            return false;
        }

        public String toString() {
            return this.f7368a;
        }
    }

    private static class m implements g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f7369a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private String f7370b;

        public m(boolean z10, String str) {
            this.f7369a = z10;
            this.f7370b = str;
        }

        @Override // N4.b.g
        public boolean a(q qVar, N4.g.L l10) {
            int i10;
            String strO = (this.f7369a && this.f7370b == null) ? l10.o() : this.f7370b;
            N4.g.J j10 = l10.f7536b;
            if (j10 != null) {
                Iterator it = j10.b().iterator();
                i10 = 0;
                while (it.hasNext()) {
                    N4.g.L l11 = (N4.g.L) ((N4.g.N) it.next());
                    if (strO == null || l11.o().equals(strO)) {
                        i10++;
                    }
                }
            } else {
                i10 = 1;
            }
            return i10 == 1;
        }

        public String toString() {
            return this.f7369a ? String.format("only-of-type <%s>", this.f7370b) : String.format("only-child", new Object[0]);
        }
    }

    private static class n implements g {
        private n() {
        }

        /* synthetic */ n(a aVar) {
            this();
        }

        @Override // N4.b.g
        public boolean a(q qVar, N4.g.L l10) {
            return l10.f7536b == null;
        }

        public String toString() {
            return "root";
        }
    }

    private static class o implements g {
        private o() {
        }

        /* synthetic */ o(a aVar) {
            this();
        }

        @Override // N4.b.g
        public boolean a(q qVar, N4.g.L l10) {
            return qVar != null && l10 == qVar.f7374a;
        }

        public String toString() {
            return "target";
        }
    }

    static class p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        s f7371a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        N4.g.E f7372b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        u f7373c;

        p(s sVar, N4.g.E e10, u uVar) {
            this.f7371a = sVar;
            this.f7372b = e10;
            this.f7373c = uVar;
        }

        public String toString() {
            return String.valueOf(this.f7371a) + " {...} (src=" + this.f7373c + ")";
        }
    }

    static class q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        N4.g.L f7374a;

        q() {
        }

        public String toString() {
            N4.g.L l10 = this.f7374a;
            return l10 != null ? String.format("<%s id=\"%s\">", l10.o(), this.f7374a.f7526c) : "";
        }
    }

    static class r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List f7375a = null;

        r() {
        }

        void a(p pVar) {
            if (this.f7375a == null) {
                this.f7375a = new ArrayList();
            }
            for (int i10 = 0; i10 < this.f7375a.size(); i10++) {
                if (((p) this.f7375a.get(i10)).f7371a.f7377b > pVar.f7371a.f7377b) {
                    this.f7375a.add(i10, pVar);
                    return;
                }
            }
            this.f7375a.add(pVar);
        }

        void b(r rVar) {
            if (rVar.f7375a == null) {
                return;
            }
            if (this.f7375a == null) {
                this.f7375a = new ArrayList(rVar.f7375a.size());
            }
            Iterator it = rVar.f7375a.iterator();
            while (it.hasNext()) {
                a((p) it.next());
            }
        }

        List c() {
            return this.f7375a;
        }

        boolean d() {
            List list = this.f7375a;
            return list == null || list.isEmpty();
        }

        void e(u uVar) {
            List list = this.f7375a;
            if (list == null) {
                return;
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((p) it.next()).f7373c == uVar) {
                    it.remove();
                }
            }
        }

        int f() {
            List list = this.f7375a;
            if (list != null) {
                return list.size();
            }
            return 0;
        }

        public String toString() {
            if (this.f7375a == null) {
                return "";
            }
            StringBuilder sb2 = new StringBuilder();
            Iterator it = this.f7375a.iterator();
            while (it.hasNext()) {
                sb2.append(((p) it.next()).toString());
                sb2.append('\n');
            }
            return sb2.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class s {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        List f7376a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f7377b;

        private s() {
            this.f7376a = null;
            this.f7377b = 0;
        }

        /* synthetic */ s(a aVar) {
            this();
        }

        void a(t tVar) {
            if (this.f7376a == null) {
                this.f7376a = new ArrayList();
            }
            this.f7376a.add(tVar);
        }

        void b() {
            this.f7377b += 1000;
        }

        void c() {
            this.f7377b++;
        }

        void d() {
            this.f7377b += 1000000;
        }

        t e(int i10) {
            return (t) this.f7376a.get(i10);
        }

        boolean f() {
            List list = this.f7376a;
            return list == null || list.isEmpty();
        }

        int g() {
            List list = this.f7376a;
            if (list == null) {
                return 0;
            }
            return list.size();
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            Iterator it = this.f7376a.iterator();
            while (it.hasNext()) {
                sb2.append((t) it.next());
                sb2.append(' ');
            }
            sb2.append('[');
            sb2.append(this.f7377b);
            sb2.append(']');
            return sb2.toString();
        }
    }

    private static class t {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        e f7378a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        String f7379b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        List f7380c = null;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        List f7381d = null;

        t(e eVar, String str) {
            this.f7378a = null;
            this.f7379b = null;
            this.f7378a = eVar == null ? e.DESCENDANT : eVar;
            this.f7379b = str;
        }

        void a(String str, c cVar, String str2) {
            if (this.f7380c == null) {
                this.f7380c = new ArrayList();
            }
            this.f7380c.add(new C0130b(str, cVar, str2));
        }

        void b(g gVar) {
            if (this.f7381d == null) {
                this.f7381d = new ArrayList();
            }
            this.f7381d.add(gVar);
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder();
            e eVar = this.f7378a;
            if (eVar == e.CHILD) {
                sb2.append("> ");
            } else if (eVar == e.FOLLOWS) {
                sb2.append("+ ");
            }
            String str = this.f7379b;
            if (str == null) {
                str = "*";
            }
            sb2.append(str);
            List<C0130b> list = this.f7380c;
            if (list != null) {
                for (C0130b c0130b : list) {
                    sb2.append('[');
                    sb2.append(c0130b.f7309a);
                    int i10 = a.f7307a[c0130b.f7310b.ordinal()];
                    if (i10 == 1) {
                        sb2.append('=');
                        sb2.append(c0130b.f7311c);
                    } else if (i10 == 2) {
                        sb2.append("~=");
                        sb2.append(c0130b.f7311c);
                    } else if (i10 == 3) {
                        sb2.append("|=");
                        sb2.append(c0130b.f7311c);
                    }
                    sb2.append(']');
                }
            }
            List<g> list2 = this.f7381d;
            if (list2 != null) {
                for (g gVar : list2) {
                    sb2.append(':');
                    sb2.append(gVar);
                }
            }
            return sb2.toString();
        }
    }

    enum u {
        Document,
        RenderOptions
    }

    b(f fVar, u uVar) {
        this.f7306c = false;
        this.f7304a = fVar;
        this.f7305b = uVar;
    }

    b(u uVar) {
        this(f.screen, uVar);
    }

    private static int a(List list, int i10, N4.g.L l10) {
        int i11 = 0;
        if (i10 < 0) {
            return 0;
        }
        Object obj = list.get(i10);
        N4.g.J j10 = l10.f7536b;
        if (obj != j10) {
            return -1;
        }
        Iterator it = j10.b().iterator();
        while (it.hasNext()) {
            if (((N4.g.N) it.next()) == l10) {
                return i11;
            }
            i11++;
        }
        return -1;
    }

    static boolean b(String str, f fVar) {
        d dVar = new d(str);
        dVar.A();
        return c(h(dVar), fVar);
    }

    private static boolean c(List list, f fVar) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            f fVar2 = (f) it.next();
            if (fVar2 == f.all || fVar2 == fVar) {
                return true;
            }
        }
        return false;
    }

    private void e(r rVar, d dVar) throws N4.a {
        String strH = dVar.H();
        dVar.A();
        if (strH == null) {
            throw new N4.a("Invalid '@' rule");
        }
        if (!this.f7306c && strH.equals("media")) {
            List listH = h(dVar);
            if (!dVar.f('{')) {
                throw new N4.a("Invalid @media rule: missing rule set");
            }
            dVar.A();
            if (c(listH, this.f7304a)) {
                this.f7306c = true;
                rVar.b(j(dVar));
                this.f7306c = false;
            } else {
                j(dVar);
            }
            if (!dVar.h() && !dVar.f('}')) {
                throw new N4.a("Invalid @media rule: expected '}' at end of rule set");
            }
        } else if (this.f7306c || !strH.equals("import")) {
            p("Ignoring @%s rule", strH);
            o(dVar);
        } else {
            String strN = dVar.N();
            if (strN == null) {
                strN = dVar.F();
            }
            if (strN == null) {
                throw new N4.a("Invalid @import rule: expected string or url()");
            }
            dVar.A();
            h(dVar);
            if (!dVar.h() && !dVar.f(';')) {
                throw new N4.a("Invalid @media rule: expected '}' at end of rule set");
            }
            N4.g.k();
        }
        dVar.A();
    }

    public static List f(String str) {
        d dVar = new d(str);
        ArrayList arrayList = null;
        while (!dVar.h()) {
            String strR = dVar.r();
            if (strR != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(strR);
                dVar.A();
            }
        }
        return arrayList;
    }

    private N4.g.E g(d dVar) throws N4.a {
        N4.g.E e10 = new N4.g.E();
        do {
            String strH = dVar.H();
            dVar.A();
            if (!dVar.f(':')) {
                throw new N4.a("Expected ':'");
            }
            dVar.A();
            String strJ = dVar.J();
            if (strJ == null) {
                throw new N4.a("Expected property value");
            }
            dVar.A();
            if (dVar.f('!')) {
                dVar.A();
                if (!dVar.g("important")) {
                    throw new N4.a("Malformed rule set: found unexpected '!'");
                }
                dVar.A();
            }
            dVar.f(';');
            N4.k.S0(e10, strH, strJ);
            dVar.A();
            if (dVar.h()) {
                break;
            }
        } while (!dVar.f('}'));
        return e10;
    }

    private static List h(d dVar) {
        String strW;
        ArrayList arrayList = new ArrayList();
        while (!dVar.h() && (strW = dVar.w()) != null) {
            try {
                arrayList.add(f.valueOf(strW));
            } catch (IllegalArgumentException unused) {
            }
            if (!dVar.z()) {
                break;
            }
        }
        return arrayList;
    }

    private boolean i(r rVar, d dVar) throws N4.a {
        List listL = dVar.L();
        if (listL == null || listL.isEmpty()) {
            return false;
        }
        if (!dVar.f('{')) {
            throw new N4.a("Malformed rule block: expected '{'");
        }
        dVar.A();
        N4.g.E eG = g(dVar);
        dVar.A();
        Iterator it = listL.iterator();
        while (it.hasNext()) {
            rVar.a(new p((s) it.next(), eG, this.f7305b));
        }
        return true;
    }

    private r j(d dVar) {
        r rVar = new r();
        while (!dVar.h()) {
            try {
                if (!dVar.g("<!--") && !dVar.g("-->")) {
                    if (!dVar.f('@')) {
                        if (!i(rVar, dVar)) {
                            break;
                        }
                    } else {
                        e(rVar, dVar);
                    }
                }
            } catch (N4.a e10) {
                Log.e("CSSParser", "CSS parser terminated early due to error: " + e10.getMessage());
                return rVar;
            }
        }
        return rVar;
    }

    private static boolean k(q qVar, s sVar, int i10, List list, int i11, N4.g.L l10) {
        t tVarE = sVar.e(i10);
        if (!n(qVar, tVarE, list, i11, l10)) {
            return false;
        }
        e eVar = tVarE.f7378a;
        if (eVar == e.DESCENDANT) {
            if (i10 == 0) {
                return true;
            }
            while (i11 >= 0) {
                if (m(qVar, sVar, i10 - 1, list, i11)) {
                    return true;
                }
                i11--;
            }
            return false;
        }
        if (eVar == e.CHILD) {
            return m(qVar, sVar, i10 - 1, list, i11);
        }
        int iA = a(list, i11, l10);
        if (iA <= 0) {
            return false;
        }
        return k(qVar, sVar, i10 - 1, list, i11, (N4.g.L) l10.f7536b.b().get(iA - 1));
    }

    static boolean l(q qVar, s sVar, N4.g.L l10) {
        ArrayList arrayList = new ArrayList();
        for (Object obj = l10.f7536b; obj != null; obj = ((N4.g.N) obj).f7536b) {
            arrayList.add(0, obj);
        }
        int size = arrayList.size() - 1;
        return sVar.g() == 1 ? n(qVar, sVar.e(0), arrayList, size, l10) : k(qVar, sVar, sVar.g() - 1, arrayList, size, l10);
    }

    private static boolean m(q qVar, s sVar, int i10, List list, int i11) {
        t tVarE = sVar.e(i10);
        N4.g.L l10 = (N4.g.L) list.get(i11);
        if (!n(qVar, tVarE, list, i11, l10)) {
            return false;
        }
        e eVar = tVarE.f7378a;
        if (eVar == e.DESCENDANT) {
            if (i10 == 0) {
                return true;
            }
            while (i11 > 0) {
                i11--;
                if (m(qVar, sVar, i10 - 1, list, i11)) {
                    return true;
                }
            }
            return false;
        }
        if (eVar == e.CHILD) {
            return m(qVar, sVar, i10 - 1, list, i11 - 1);
        }
        int iA = a(list, i11, l10);
        if (iA <= 0) {
            return false;
        }
        return k(qVar, sVar, i10 - 1, list, i11, (N4.g.L) l10.f7536b.b().get(iA - 1));
    }

    private static boolean n(q qVar, t tVar, List list, int i10, N4.g.L l10) {
        List list2;
        String str = tVar.f7379b;
        if (str != null && !str.equals(l10.o().toLowerCase(Locale.US))) {
            return false;
        }
        List<C0130b> list3 = tVar.f7380c;
        if (list3 != null) {
            for (C0130b c0130b : list3) {
                String str2 = c0130b.f7309a;
                str2.getClass();
                if (str2.equals("id")) {
                    if (!c0130b.f7311c.equals(l10.f7526c)) {
                        return false;
                    }
                } else if (!str2.equals("class") || (list2 = l10.f7530g) == null || !list2.contains(c0130b.f7311c)) {
                    return false;
                }
            }
        }
        List list4 = tVar.f7381d;
        if (list4 == null) {
            return true;
        }
        Iterator it = list4.iterator();
        while (it.hasNext()) {
            if (!((g) it.next()).a(qVar, l10)) {
                return false;
            }
        }
        return true;
    }

    private void o(d dVar) {
        int i10 = 0;
        while (!dVar.h()) {
            int iIntValue = dVar.l().intValue();
            if (iIntValue == 59 && i10 == 0) {
                return;
            }
            if (iIntValue == 123) {
                i10++;
            } else if (iIntValue == 125 && i10 > 0 && (i10 = i10 - 1) == 0) {
                return;
            }
        }
    }

    private static void p(String str, Object... objArr) {
        Log.w("CSSParser", String.format(str, objArr));
    }

    r d(String str) {
        d dVar = new d(str);
        dVar.A();
        return j(dVar);
    }
}
