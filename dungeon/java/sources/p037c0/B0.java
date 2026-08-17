package p037c0;

import android.graphics.Matrix;
import android.graphics.Shader;

/* JADX INFO: loaded from: classes.dex */
public final class B0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Matrix f26658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Shader f26659b;

    private final Matrix b() {
        Matrix matrix = this.f26658a;
        if (matrix != null) {
            return matrix;
        }
        Matrix matrix2 = new Matrix();
        this.f26658a = matrix2;
        return matrix2;
    }

    public final Shader a() {
        return this.f26659b;
    }

    public final void c(Shader shader) {
        Matrix matrix = this.f26658a;
        if (matrix != null && shader != null) {
            shader.setLocalMatrix(matrix);
        }
        this.f26659b = shader;
    }

    public final void d(float[] fArr) {
        Matrix matrix;
        if (fArr == null) {
            matrix = null;
            this.f26658a = null;
        } else {
            Matrix matrixB = b();
            J.a(matrixB, fArr);
            matrix = matrixB;
        }
        Shader shader = this.f26659b;
        if (shader != null) {
            shader.setLocalMatrix(matrix);
        }
    }
}
