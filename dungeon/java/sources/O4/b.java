package O4;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class b implements O4.a {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f8371b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final File f8372a;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final b a(File file) {
            Intrinsics.checkNotNullParameter(file, "file");
            return new b(file, null);
        }

        public final b b(File file) {
            if (file != null) {
                return new b(file, null);
            }
            return null;
        }
    }

    private b(File file) {
        this.f8372a = file;
    }

    public /* synthetic */ b(File file, DefaultConstructorMarker defaultConstructorMarker) {
        this(file);
    }

    public static final b b(File file) {
        return f8371b.a(file);
    }

    public static final b c(File file) {
        return f8371b.b(file);
    }

    @Override // O4.a
    public InputStream a() {
        return new FileInputStream(this.f8372a);
    }

    public final File d() {
        return this.f8372a;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof b)) {
            return false;
        }
        return Intrinsics.b(this.f8372a, ((b) obj).f8372a);
    }

    public int hashCode() {
        return this.f8372a.hashCode();
    }

    @Override // O4.a
    public long size() {
        return this.f8372a.length();
    }
}
