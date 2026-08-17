package p407wb;

import expo.modules.filesystem.FileSystemPath;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes2.dex */
public abstract class f {

    public static final class a extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f56736a = new a();

        private a() {
            super(null);
        }
    }

    public static final class b extends f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final FileSystemPath f56737a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(FileSystemPath path) {
            super(null);
            Intrinsics.checkNotNullParameter(path, "path");
            this.f56737a = path;
        }

        public final FileSystemPath a() {
            return this.f56737a;
        }
    }

    private f() {
    }

    public /* synthetic */ f(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }
}
