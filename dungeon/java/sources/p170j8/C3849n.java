package p170j8;

import com.google.android.gms.common.util.l;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: j8.n, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public class C3849n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final C3845j f47000b = new C3845j("LibraryVersion", "");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final C3849n f47001c = new C3849n();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ConcurrentHashMap f47002a = new ConcurrentHashMap();

    protected C3849n() {
    }

    public static C3849n a() {
        return f47001c;
    }

    public String b(String str) throws Throwable {
        String str2;
        InputStream resourceAsStream;
        r.g(str, "Please provide a valid libraryName");
        ConcurrentHashMap concurrentHashMap = this.f47002a;
        if (concurrentHashMap.containsKey(str)) {
            return (String) concurrentHashMap.get(str);
        }
        Properties properties = new Properties();
        InputStream inputStream = null;
        property = null;
        String property = null;
        inputStream = null;
        try {
            try {
                resourceAsStream = C3849n.class.getResourceAsStream(String.format("/%s.properties", str));
                try {
                    if (resourceAsStream != null) {
                        properties.load(resourceAsStream);
                        property = properties.getProperty("version", null);
                        C3845j c3845j = f47000b;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 12 + String.valueOf(property).length());
                        sb2.append(str);
                        sb2.append(" version is ");
                        sb2.append(property);
                        c3845j.f("LibraryVersion", sb2.toString());
                    } else {
                        C3845j c3845j2 = f47000b;
                        StringBuilder sb3 = new StringBuilder(String.valueOf(str).length() + 43);
                        sb3.append("Failed to get app version for libraryName: ");
                        sb3.append(str);
                        c3845j2.g("LibraryVersion", sb3.toString());
                    }
                } catch (IOException e10) {
                    e = e10;
                    str2 = property;
                    inputStream = resourceAsStream;
                    C3845j c3845j3 = f47000b;
                    StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 43);
                    sb4.append("Failed to get app version for libraryName: ");
                    sb4.append(str);
                    c3845j3.e("LibraryVersion", sb4.toString(), e);
                    resourceAsStream = inputStream;
                    property = str2;
                } catch (Throwable th) {
                    th = th;
                    inputStream = resourceAsStream;
                    if (inputStream != null) {
                        l.a(inputStream);
                    }
                    throw th;
                }
            } catch (IOException e11) {
                e = e11;
                str2 = null;
            }
            if (resourceAsStream != null) {
                l.a(resourceAsStream);
            }
            if (property == null) {
                f47000b.b("LibraryVersion", ".properties file is dropped during release process. Failure to read app version is expected during Google internal testing where locally-built libraries are used");
                property = "UNKNOWN";
            }
            this.f47002a.put(str, property);
            return property;
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
