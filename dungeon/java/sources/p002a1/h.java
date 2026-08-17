package p002a1;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.Base64;
import android.util.Xml;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p146i1.f;

/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    static class a {
        static int a(TypedArray typedArray, int i10) {
            return typedArray.getType(i10);
        }
    }

    public interface b {
    }

    public static final class c implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final d[] f19074a;

        public c(d[] dVarArr) {
            this.f19074a = dVarArr;
        }

        public d[] a() {
            return this.f19074a;
        }
    }

    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final String f19075a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f19076b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final boolean f19077c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f19078d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int f19079e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private final int f19080f;

        public d(String str, int i10, boolean z10, String str2, int i11, int i12) {
            this.f19075a = str;
            this.f19076b = i10;
            this.f19077c = z10;
            this.f19078d = str2;
            this.f19079e = i11;
            this.f19080f = i12;
        }

        public String a() {
            return this.f19075a;
        }

        public int b() {
            return this.f19080f;
        }

        public int c() {
            return this.f19079e;
        }

        public String d() {
            return this.f19078d;
        }

        public int e() {
            return this.f19076b;
        }

        public boolean f() {
            return this.f19077c;
        }
    }

    public static final class e implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final List f19081a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f19082b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f19083c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final String f19084d;

        public e(List list, int i10, int i11, String str) {
            this.f19081a = list;
            this.f19083c = i10;
            this.f19082b = i11;
            this.f19084d = str;
        }

        public int a() {
            return this.f19083c;
        }

        public List b() {
            return this.f19081a;
        }

        public String c() {
            return this.f19084d;
        }

        public int d() {
            return this.f19082b;
        }
    }

    private static int a(TypedArray typedArray, int i10) {
        return a.a(typedArray, i10);
    }

    public static b b(XmlPullParser xmlPullParser, Resources resources) {
        int next;
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return e(xmlPullParser, resources);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static List c(Resources resources, int i10) {
        if (i10 == 0) {
            return Collections.EMPTY_LIST;
        }
        TypedArray typedArrayObtainTypedArray = resources.obtainTypedArray(i10);
        try {
            if (typedArrayObtainTypedArray.length() == 0) {
                return Collections.EMPTY_LIST;
            }
            ArrayList arrayList = new ArrayList();
            if (a(typedArrayObtainTypedArray, 0) == 1) {
                for (int i11 = 0; i11 < typedArrayObtainTypedArray.length(); i11++) {
                    int resourceId = typedArrayObtainTypedArray.getResourceId(i11, 0);
                    if (resourceId != 0) {
                        arrayList.add(i(resources.getStringArray(resourceId)));
                    }
                }
            } else {
                arrayList.add(i(resources.getStringArray(i10)));
            }
            return arrayList;
        } finally {
            typedArrayObtainTypedArray.recycle();
        }
    }

    private static f d(XmlPullParser xmlPullParser, Resources resources, String str, String str2, List list) throws Exception {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), X0.d.f15181B);
        try {
            String string = typedArrayObtainAttributes.getString(X0.d.f15182C);
            String string2 = typedArrayObtainAttributes.getString(X0.d.f15183D);
            String string3 = typedArrayObtainAttributes.getString(X0.d.f15184E);
            if (string == null) {
                throw new XmlPullParserException("query attribute must be set in fallback element");
            }
            while (xmlPullParser.next() != 3) {
                h(xmlPullParser);
            }
            f fVar = new f(str, str2, string, list, string2, string3);
            p002a1.e.a(typedArrayObtainAttributes);
            return fVar;
        } catch (Throwable th) {
            if (typedArrayObtainAttributes == null) {
                throw th;
            }
            try {
                p002a1.e.a(typedArrayObtainAttributes);
                throw th;
            } catch (Throwable th2) {
                th.addSuppressed(th2);
                throw th;
            }
        }
    }

    private static b e(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        xmlPullParser.require(2, null, "font-family");
        if (xmlPullParser.getName().equals("font-family")) {
            return f(xmlPullParser, resources);
        }
        h(xmlPullParser);
        return null;
    }

    private static b f(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), X0.d.f15208h);
        String string = typedArrayObtainAttributes.getString(X0.d.f15209i);
        String string2 = typedArrayObtainAttributes.getString(X0.d.f15214n);
        String string3 = typedArrayObtainAttributes.getString(X0.d.f15215o);
        String string4 = typedArrayObtainAttributes.getString(X0.d.f15211k);
        int resourceId = typedArrayObtainAttributes.getResourceId(X0.d.f15210j, 0);
        int integer = typedArrayObtainAttributes.getInteger(X0.d.f15212l, 1);
        int integer2 = typedArrayObtainAttributes.getInteger(X0.d.f15213m, 500);
        String string5 = typedArrayObtainAttributes.getString(X0.d.f15216p);
        typedArrayObtainAttributes.recycle();
        if (string == null || string2 == null) {
            ArrayList arrayList = new ArrayList();
            while (xmlPullParser.next() != 3) {
                if (xmlPullParser.getEventType() == 2) {
                    if (xmlPullParser.getName().equals("font")) {
                        arrayList.add(g(xmlPullParser, resources));
                    } else {
                        h(xmlPullParser);
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            return new c((d[]) arrayList.toArray(new d[0]));
        }
        List listC = c(resources, resourceId);
        ArrayList arrayList2 = new ArrayList();
        while (xmlPullParser.next() != 3) {
            if (xmlPullParser.getEventType() == 2) {
                if (xmlPullParser.getName().equals("fallback")) {
                    arrayList2.add(d(xmlPullParser, resources, string, string2, listC));
                } else {
                    h(xmlPullParser);
                }
            }
        }
        if (!arrayList2.isEmpty()) {
            return new e(arrayList2, integer, integer2, string5);
        }
        if (string3 == null) {
            throw new IllegalArgumentException("The provider font XML requires query attribute or fallback children.");
        }
        arrayList2.add(new f(string, string2, string3, listC, null, null));
        if (string4 != null) {
            arrayList2.add(new f(string, string2, string4, listC, null, null));
        }
        return new e(arrayList2, integer, integer2, string5);
    }

    private static d g(XmlPullParser xmlPullParser, Resources resources) throws XmlPullParserException, IOException {
        TypedArray typedArrayObtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), X0.d.f15217q);
        int i10 = typedArrayObtainAttributes.getInt(typedArrayObtainAttributes.hasValue(X0.d.f15226z) ? X0.d.f15226z : X0.d.f15219s, 400);
        boolean z10 = 1 == typedArrayObtainAttributes.getInt(typedArrayObtainAttributes.hasValue(X0.d.f15224x) ? X0.d.f15224x : X0.d.f15220t, 0);
        int i11 = typedArrayObtainAttributes.hasValue(X0.d.f15180A) ? X0.d.f15180A : X0.d.f15221u;
        String string = typedArrayObtainAttributes.getString(typedArrayObtainAttributes.hasValue(X0.d.f15225y) ? X0.d.f15225y : X0.d.f15222v);
        int i12 = typedArrayObtainAttributes.getInt(i11, 0);
        int i13 = typedArrayObtainAttributes.hasValue(X0.d.f15223w) ? X0.d.f15223w : X0.d.f15218r;
        int resourceId = typedArrayObtainAttributes.getResourceId(i13, 0);
        String string2 = typedArrayObtainAttributes.getString(i13);
        typedArrayObtainAttributes.recycle();
        while (xmlPullParser.next() != 3) {
            h(xmlPullParser);
        }
        return new d(string2, i10, z10, string, i12, resourceId);
    }

    private static void h(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int i10 = 1;
        while (i10 > 0) {
            int next = xmlPullParser.next();
            if (next == 2) {
                i10++;
            } else if (next == 3) {
                i10--;
            }
        }
    }

    private static List i(String[] strArr) {
        ArrayList arrayList = new ArrayList();
        for (String str : strArr) {
            arrayList.add(Base64.decode(str, 0));
        }
        return arrayList;
    }
}
