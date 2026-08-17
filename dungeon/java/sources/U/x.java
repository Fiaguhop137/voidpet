package U;

import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.text.StringsKt;

/* JADX INFO: loaded from: classes.dex */
public abstract class x {
    private static final boolean a(v vVar) {
        return vVar.g() < vVar.f().length() - 1 && Character.isLetter(vVar.f().charAt(vVar.g())) && vVar.f().charAt(vVar.g() + 1) == '(';
    }

    private static final List b(v vVar) throws t {
        boolean z10;
        Integer numValueOf;
        ArrayList arrayList = new ArrayList();
        while (!vVar.c() && !vVar.h(':')) {
            if (vVar.h('*')) {
                v.b(vVar, 0, 1, null);
                z10 = true;
            } else {
                z10 = false;
            }
            Integer numValueOf2 = !vVar.h('@') ? Integer.valueOf(vVar.j("@") + 1) : null;
            v.b(vVar, 0, 1, null);
            int iJ = vVar.j("L,:");
            if (vVar.h('L')) {
                v.b(vVar, 0, 1, null);
                numValueOf = Integer.valueOf(vVar.j(",:"));
            } else {
                numValueOf = null;
            }
            arrayList.add(new p(numValueOf2 != null ? numValueOf2.intValue() : -1, iJ, numValueOf != null ? numValueOf.intValue() : -1, z10));
            if (vVar.h(',')) {
                v.b(vVar, 0, 1, null);
            }
        }
        v.b(vVar, 0, 1, null);
        return arrayList;
    }

    private static final List c(v vVar) throws t {
        String strG;
        vVar.a(2);
        ArrayList arrayList = new ArrayList();
        boolean z10 = false;
        while (!vVar.c() && !vVar.h(')')) {
            if (vVar.h('!')) {
                v.b(vVar, 0, 1, null);
                String strK = vVar.k("!,)");
                if (strK.length() != 0) {
                    int i10 = Integer.parseInt(strK);
                    int i11 = 0;
                    while (i10 > 0) {
                        int size = arrayList.size();
                        int i12 = 0;
                        while (true) {
                            if (i12 >= size) {
                                arrayList.add(new s(i11, null, null, 6, null));
                                i10--;
                                break;
                            }
                            if (((s) arrayList.get(i12)).a() == i11) {
                                i11++;
                                break;
                            }
                            i12++;
                        }
                    }
                } else {
                    z10 = true;
                }
            } else {
                int iJ = vVar.j("!:,)");
                if (vVar.h(':')) {
                    v.b(vVar, 0, 1, null);
                    strG = g(vVar.k("!,)"));
                } else {
                    strG = null;
                }
                if (z10) {
                    int i13 = 0;
                    while (i13 < iJ) {
                        int size2 = arrayList.size();
                        int i14 = 0;
                        while (true) {
                            if (i14 >= size2) {
                                arrayList.add(new s(i13, null, null, 6, null));
                                break;
                            }
                            if (((s) arrayList.get(i14)).a() == i13) {
                                i13++;
                                break;
                            }
                            i14++;
                        }
                    }
                    z10 = false;
                }
                arrayList.add(new s(iJ, null, strG, 2, null));
            }
            if (vVar.h(',')) {
                v.b(vVar, 0, 1, null);
            }
        }
        vVar.e(')');
        v.b(vVar, 0, 1, null);
        return arrayList;
    }

    private static final List d(v vVar) throws t {
        String strG;
        vVar.a(2);
        ArrayList arrayList = new ArrayList();
        while (!vVar.c() && !vVar.h(')')) {
            String strK = vVar.k(":,)");
            if (vVar.h(':')) {
                v.b(vVar, 0, 1, null);
                strG = g(vVar.k(",)"));
            } else {
                strG = null;
            }
            arrayList.add(new s(arrayList.size(), strK, strG));
            if (vVar.h(',')) {
                v.b(vVar, 0, 1, null);
            }
        }
        vVar.e(')');
        v.b(vVar, 0, 1, null);
        return arrayList;
    }

    public static final w e(String str) {
        if (str.length() == 0) {
            return null;
        }
        try {
            return f(str);
        } catch (t e10) {
            Q.x.a(e10.getMessage(), e10);
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:17:0x004a  */
    /* JADX WARN: Code duplicated, block: B:29:0x0071  */
    /* JADX WARN: Code duplicated, block: B:31:0x0077  */
    /* JADX WARN: Code duplicated, block: B:32:0x007a  */
    /* JADX WARN: Code duplicated, block: B:34:0x0080  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:47:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:50:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:54:0x0096 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:55:0x0091 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0086 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x0056 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:58:0x0052 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:66:0x0082 A[SYNTHETIC] */
    public static final w f(String str) throws t {
        boolean z10;
        boolean z11;
        String strK;
        List listL;
        List listL2;
        String strK2;
        char cD;
        int i10;
        v vVar = new v(str);
        String strL = null;
        if (vVar.h('C')) {
            v.b(vVar, 0, 1, null);
            if (vVar.h('C')) {
                v.b(vVar, 0, 1, null);
                z10 = true;
            } else {
                z10 = false;
            }
            if (vVar.h('(')) {
                v.b(vVar, 0, 1, null);
                strK = vVar.k(")");
                vVar.e(')');
                v.b(vVar, 0, 1, null);
                z11 = true;
            } else {
                z11 = true;
            }
            listL = CollectionsKt.l();
            while (a(vVar)) {
                cD = vVar.d();
                if (cD != 'N') {
                    listL = d(vVar);
                } else if (cD != 'P') {
                    vVar.a(2);
                    i10 = 0;
                    while (true) {
                        if (i10 > 0 && vVar.h(')')) {
                            vVar.e(')');
                            v.b(vVar, 0, 1, null);
                            break;
                        }
                        if (!vVar.c()) {
                            vVar.m("unexpected end");
                            throw new Ad.g();
                        }
                        if (vVar.h('(')) {
                            i10++;
                        } else if (vVar.h(')')) {
                            i10--;
                        }
                        v.b(vVar, 0, 1, null);
                    }
                } else {
                    listL = c(vVar);
                }
            }
            listL2 = CollectionsKt.l();
            if (vVar.h(':')) {
                v.b(vVar, 0, 1, null);
            } else {
                listL2 = b(vVar);
            }
            strK2 = vVar.k("#");
            if (strK2.length() <= 0) {
                strK2 = null;
            }
            if (vVar.h('#')) {
                v.b(vVar, 0, 1, null);
                strL = vVar.l();
            }
            String str2 = strK2;
            return new w(z11, z10, strK, str2, listL, strL, listL2, str);
        }
        z10 = false;
        z11 = false;
        strK = null;
        listL = CollectionsKt.l();
        while (a(vVar)) {
            cD = vVar.d();
            if (cD != 'N') {
                listL = d(vVar);
            } else if (cD != 'P') {
                vVar.a(2);
                i10 = 0;
                while (true) {
                    if (i10 > 0) {
                    }
                    if (!vVar.c()) {
                        vVar.m("unexpected end");
                        throw new Ad.g();
                    }
                    if (vVar.h('(')) {
                        i10++;
                    } else if (vVar.h(')')) {
                        i10--;
                    }
                    v.b(vVar, 0, 1, null);
                }
            } else {
                listL = c(vVar);
            }
        }
        listL2 = CollectionsKt.l();
        if (vVar.h(':')) {
            listL2 = b(vVar);
        } else {
            v.b(vVar, 0, 1, null);
        }
        strK2 = vVar.k("#");
        if (strK2.length() <= 0) {
            strK2 = null;
        }
        if (vVar.h('#')) {
            v.b(vVar, 0, 1, null);
            strL = vVar.l();
        }
        String str3 = strK2;
        return new w(z11, z10, strK, str3, listL, strL, listL2, str);
    }

    private static final String g(String str) {
        return StringsKt.K(str, "c#", "androidx.compose.", false, 4, null);
    }
}
