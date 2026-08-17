package p037c0;

import android.graphics.Shader;

/* JADX INFO: loaded from: classes.dex */
public abstract class Q {

    public static final class a extends v0 {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ Shader f26686f;

        a(Shader shader) {
            this.f26686f = shader;
        }

        @Override // p037c0.v0
        public Shader b(long j10) {
            return this.f26686f;
        }
    }

    public static final v0 a(Shader shader) {
        return new a(shader);
    }
}
