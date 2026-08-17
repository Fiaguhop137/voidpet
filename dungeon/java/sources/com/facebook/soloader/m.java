package com.facebook.soloader;

import android.content.Context;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* JADX INFO: loaded from: classes2.dex */
public class m extends G {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected final File f31374f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected final String f31375g;

    protected static final class a extends G.c implements Comparable {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final ZipEntry f31376c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final int f31377d;

        a(String str, ZipEntry zipEntry, int i10) {
            super(str, String.valueOf(zipEntry.getCrc()));
            this.f31376c = zipEntry;
            this.f31377d = i10;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public int compareTo(a aVar) {
            return this.f31329a.compareTo(aVar.f31329a);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && a.class == obj.getClass()) {
                a aVar = (a) obj;
                if (this.f31376c.equals(aVar.f31376c) && this.f31377d == aVar.f31377d) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return (this.f31377d * 31) + this.f31376c.hashCode();
        }
    }

    protected class b extends G.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected a[] f31378a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final ZipFile f31379b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final G f31380c;

        b(G g10) {
            this.f31379b = new ZipFile(m.this.f31374f);
            this.f31380c = g10;
        }

        @Override // com.facebook.soloader.G.e
        public final G.c[] b() {
            return e();
        }

        @Override // com.facebook.soloader.G.e
        public void c(File file) throws IOException {
            byte[] bArr = new byte[32768];
            for (a aVar : e()) {
                InputStream inputStream = this.f31379b.getInputStream(aVar.f31376c);
                try {
                    G.d dVar = new G.d(aVar, inputStream);
                    inputStream = null;
                    try {
                        a(dVar, bArr, file);
                        dVar.close();
                    } catch (Throwable th) {
                        try {
                            dVar.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                } catch (Throwable th3) {
                    if (inputStream != null) {
                        inputStream.close();
                    }
                    throw th3;
                }
            }
        }

        @Override // com.facebook.soloader.G.e, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            this.f31379b.close();
        }

        a[] d() {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            HashMap map = new HashMap();
            Pattern patternCompile = Pattern.compile(m.this.f31375g);
            String[] strArrJ = SysUtil.j();
            Enumeration<? extends ZipEntry> enumerationEntries = this.f31379b.entries();
            while (enumerationEntries.hasMoreElements()) {
                ZipEntry zipEntryNextElement = enumerationEntries.nextElement();
                Matcher matcher = patternCompile.matcher(zipEntryNextElement.getName());
                if (matcher.matches()) {
                    int iGroupCount = matcher.groupCount();
                    String strGroup = matcher.group(iGroupCount - 1);
                    String strGroup2 = matcher.group(iGroupCount);
                    int iE = SysUtil.e(strArrJ, strGroup);
                    if (iE >= 0) {
                        linkedHashSet.add(strGroup);
                        a aVar = (a) map.get(strGroup2);
                        if (aVar == null || iE < aVar.f31377d) {
                            map.put(strGroup2, new a(strGroup2, zipEntryNextElement, iE));
                        }
                    }
                }
            }
            this.f31380c.t((String[]) linkedHashSet.toArray(new String[linkedHashSet.size()]));
            a[] aVarArr = (a[]) map.values().toArray(new a[map.size()]);
            Arrays.sort(aVarArr);
            return aVarArr;
        }

        a[] e() {
            a[] aVarArr = this.f31378a;
            if (aVarArr != null) {
                return aVarArr;
            }
            a[] aVarArrD = d();
            this.f31378a = aVarArrD;
            return aVarArrD;
        }
    }

    public m(Context context, String str, File file, String str2) {
        super(context, str);
        this.f31374f = file;
        this.f31375g = str2;
    }

    @Override // com.facebook.soloader.C2305f, com.facebook.soloader.E
    public String c() {
        return "ExtractFromZipSoSource";
    }

    @Override // com.facebook.soloader.G
    protected G.e q() {
        return new b(this);
    }

    @Override // com.facebook.soloader.C2305f, com.facebook.soloader.E
    public String toString() {
        try {
            return this.f31374f.getCanonicalPath();
        } catch (IOException unused) {
            return this.f31374f.getName();
        }
    }

    public boolean v() throws IOException {
        b bVar = new b(this);
        try {
            boolean z10 = bVar.d().length != 0;
            bVar.close();
            return z10;
        } catch (Throwable th) {
            try {
                bVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
