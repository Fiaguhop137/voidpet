package com.google.android.gms.common.data;

import android.graphics.Bitmap;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.io.BufferedOutputStream;
import java.io.Closeable;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import p170j8.r;

/* JADX INFO: loaded from: classes2.dex */
public class BitmapTeleporter extends p188k8.a implements ReflectedParcelable {

    @NonNull
    public static final Parcelable.Creator<BitmapTeleporter> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f31883a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    ParcelFileDescriptor f31884b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final int f31885c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Bitmap f31886d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f31887e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private File f31888f;

    BitmapTeleporter(int i10, ParcelFileDescriptor parcelFileDescriptor, int i11) {
        this.f31883a = i10;
        this.f31884b = parcelFileDescriptor;
        this.f31885c = i11;
    }

    private static final void a4(Closeable closeable) {
        try {
            closeable.close();
        } catch (IOException e10) {
            Log.w("BitmapTeleporter", "Could not close stream", e10);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i10) {
        if (this.f31884b == null) {
            Bitmap bitmap = (Bitmap) r.l(this.f31886d);
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(bitmap.getRowBytes() * bitmap.getHeight());
            bitmap.copyPixelsToBuffer(byteBufferAllocate);
            byte[] bArrArray = byteBufferAllocate.array();
            File file = this.f31888f;
            if (file == null) {
                throw new IllegalStateException("setTempDir() must be called before writing this object to a parcel");
            }
            try {
                File fileCreateTempFile = File.createTempFile("teleporter", ".tmp", file);
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(fileCreateTempFile);
                    this.f31884b = ParcelFileDescriptor.open(fileCreateTempFile, 268435456);
                    fileCreateTempFile.delete();
                    DataOutputStream dataOutputStream = new DataOutputStream(new BufferedOutputStream(fileOutputStream));
                    try {
                        try {
                            dataOutputStream.writeInt(bArrArray.length);
                            dataOutputStream.writeInt(bitmap.getWidth());
                            dataOutputStream.writeInt(bitmap.getHeight());
                            dataOutputStream.writeUTF(bitmap.getConfig().toString());
                            dataOutputStream.write(bArrArray);
                            a4(dataOutputStream);
                        } catch (IOException e10) {
                            throw new IllegalStateException("Could not write into unlinked file", e10);
                        }
                    } catch (Throwable th) {
                        a4(dataOutputStream);
                        throw th;
                    }
                } catch (FileNotFoundException unused) {
                    throw new IllegalStateException("Temporary file is somehow already deleted");
                }
            } catch (IOException e11) {
                throw new IllegalStateException("Could not create temporary file", e11);
            }
        }
        int iA = p188k8.c.a(parcel);
        p188k8.c.n(parcel, 1, this.f31883a);
        p188k8.c.t(parcel, 2, this.f31884b, i10 | 1, false);
        p188k8.c.n(parcel, 3, this.f31885c);
        p188k8.c.b(parcel, iA);
        this.f31884b = null;
    }
}
