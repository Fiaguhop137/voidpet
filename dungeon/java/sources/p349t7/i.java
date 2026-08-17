package p349t7;

import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.channels.FileChannel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class i implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f54540a = 1179403647;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final FileChannel f54541b;

    public i(File file) {
        if (file == null || !file.exists()) {
            throw new IllegalArgumentException("File is null or does not exist");
        }
        this.f54541b = new FileInputStream(file).getChannel();
    }

    private long a(d dVar, long j10, long j11) {
        for (long j12 = 0; j12 < j10; j12++) {
            e eVarB = dVar.b(j12);
            if (eVarB.f54533a == 1) {
                long j13 = eVarB.f54535c;
                if (j13 <= j11 && j11 <= eVarB.f54536d + j13) {
                    return (j11 - j13) + eVarB.f54534b;
                }
            }
        }
        throw new IllegalStateException("Could not map vma to file offset!");
    }

    public d b() throws IOException {
        this.f54541b.position(0L);
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
        if (i(byteBufferAllocate, 0L) != 1179403647) {
            throw new IllegalArgumentException("Invalid ELF Magic!");
        }
        short sE = e(byteBufferAllocate, 4L);
        boolean z10 = e(byteBufferAllocate, 5L) == 2;
        if (sE == 1) {
            return new g(z10, this);
        }
        if (sE == 2) {
            return new h(z10, this);
        }
        throw new IllegalStateException("Invalid class type!");
    }

    public List c() throws IOException {
        long j10;
        long j11;
        this.f54541b.position(0L);
        ArrayList arrayList = new ArrayList();
        d dVarB = b();
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(8);
        byteBufferAllocate.order(dVarB.f54524a ? ByteOrder.BIG_ENDIAN : ByteOrder.LITTLE_ENDIAN);
        long j12 = dVarB.f54529f;
        int i10 = 0;
        if (j12 == 65535) {
            j12 = dVarB.c(0).f54537a;
        }
        long j13 = 0;
        while (true) {
            j10 = 1;
            if (j13 >= j12) {
                j11 = 0;
                break;
            }
            e eVarB = dVarB.b(j13);
            if (eVarB.f54533a == 2) {
                j11 = eVarB.f54534b;
                break;
            }
            j13++;
        }
        if (j11 == 0) {
            return Collections.unmodifiableList(arrayList);
        }
        ArrayList arrayList2 = new ArrayList();
        long j14 = 0;
        while (true) {
            c cVarA = dVarB.a(j11, i10);
            long j15 = j10;
            long j16 = cVarA.f54522a;
            if (j16 == j15) {
                arrayList2.add(Long.valueOf(cVarA.f54523b));
            } else if (j16 == 5) {
                j14 = cVarA.f54523b;
            }
            i10++;
            if (cVarA.f54522a == 0) {
                break;
            }
            j10 = j15;
            j12 = j12;
        }
        if (j14 == 0) {
            throw new IllegalStateException("String table offset not found!");
        }
        long jA = a(dVarB, j12, j14);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            arrayList.add(h(byteBufferAllocate, ((Long) it.next()).longValue() + jA));
        }
        return arrayList;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f54541b.close();
    }

    protected void d(ByteBuffer byteBuffer, long j10, int i10) throws IOException {
        byteBuffer.position(0);
        byteBuffer.limit(i10);
        long j11 = 0;
        while (j11 < i10) {
            int i11 = this.f54541b.read(byteBuffer, j10 + j11);
            if (i11 == -1) {
                throw new EOFException();
            }
            j11 += (long) i11;
        }
        byteBuffer.position(0);
    }

    protected short e(ByteBuffer byteBuffer, long j10) throws IOException {
        d(byteBuffer, j10, 1);
        return (short) (byteBuffer.get() & 255);
    }

    protected int f(ByteBuffer byteBuffer, long j10) throws IOException {
        d(byteBuffer, j10, 2);
        return byteBuffer.getShort() & 65535;
    }

    protected long g(ByteBuffer byteBuffer, long j10) throws IOException {
        d(byteBuffer, j10, 8);
        return byteBuffer.getLong();
    }

    protected String h(ByteBuffer byteBuffer, long j10) throws IOException {
        StringBuilder sb2 = new StringBuilder();
        while (true) {
            long j11 = 1 + j10;
            short sE = e(byteBuffer, j10);
            if (sE == 0) {
                return sb2.toString();
            }
            sb2.append((char) sE);
            j10 = j11;
        }
    }

    protected long i(ByteBuffer byteBuffer, long j10) throws IOException {
        d(byteBuffer, j10, 4);
        return ((long) byteBuffer.getInt()) & 4294967295L;
    }
}
