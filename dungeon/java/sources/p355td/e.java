package p355td;

import java.util.Date;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes3.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final p355td.f f54644a;

    public static final class a extends e {
        public a() {
            super(p355td.f.Check, null);
        }
    }

    public static final class b extends e {
        public b() {
            super(p355td.f.CheckCompleteUnavailable, null);
        }
    }

    public static final class c extends e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final Date f54645b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Date commitTime) {
            super(p355td.f.CheckCompleteAvailable, null);
            Intrinsics.checkNotNullParameter(commitTime, "commitTime");
            this.f54645b = commitTime;
        }

        public final Date b() {
            return this.f54645b;
        }
    }

    public static final class d extends e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final JSONObject f54646b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(JSONObject manifest) {
            super(p355td.f.CheckCompleteAvailable, null);
            Intrinsics.checkNotNullParameter(manifest, "manifest");
            this.f54646b = manifest;
        }

        public final JSONObject b() {
            return this.f54646b;
        }
    }

    /* JADX INFO: renamed from: td.e$e, reason: collision with other inner class name */
    public static final class C0678e extends e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f54647b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0678e(String errorMessage) {
            super(p355td.f.CheckError, null);
            Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
            this.f54647b = errorMessage;
        }

        public final p355td.d b() {
            return new p355td.d(this.f54647b);
        }
    }

    public static final class f extends e {
        public f() {
            super(p355td.f.Download, null);
        }
    }

    public static final class g extends e {
        public g() {
            super(p355td.f.DownloadComplete, null);
        }
    }

    public static final class h extends e {
        public h() {
            super(p355td.f.DownloadComplete, null);
        }
    }

    public static final class i extends e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final JSONObject f54648b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(JSONObject manifest) {
            super(p355td.f.DownloadComplete, null);
            Intrinsics.checkNotNullParameter(manifest, "manifest");
            this.f54648b = manifest;
        }

        public final JSONObject b() {
            return this.f54648b;
        }
    }

    public static final class j extends e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final String f54649b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String errorMessage) {
            super(p355td.f.DownloadError, null);
            Intrinsics.checkNotNullParameter(errorMessage, "errorMessage");
            this.f54649b = errorMessage;
        }

        public final p355td.d b() {
            return new p355td.d(this.f54649b);
        }
    }

    public static final class k extends e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final double f54650b;

        public k(double d10) {
            super(p355td.f.DownloadProgress, null);
            this.f54650b = d10;
        }

        public final double b() {
            return this.f54650b;
        }
    }

    public static final class l extends e {
        public l() {
            super(p355td.f.EndStartup, null);
        }
    }

    public static final class m extends e {
        public m() {
            super(p355td.f.Restart, null);
        }
    }

    public static final class n extends e {
        public n() {
            super(p355td.f.StartStartup, null);
        }
    }

    private e(p355td.f fVar) {
        this.f54644a = fVar;
    }

    public /* synthetic */ e(p355td.f fVar, DefaultConstructorMarker defaultConstructorMarker) {
        this(fVar);
    }

    public final p355td.f a() {
        return this.f54644a;
    }
}
