package D7;

import com.github.penfeizhou.animation.gif.io.GifReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class l extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List f2252a = new ArrayList();

    @Override // D7.b
    public void a(GifReader gifReader) throws IOException {
        gifReader.peek();
        gifReader.readUInt16();
        gifReader.readUInt16();
        gifReader.readUInt16();
        gifReader.readUInt16();
        gifReader.peek();
        gifReader.peek();
        gifReader.peek();
        gifReader.peek();
        while (true) {
            e eVarC = e.c(gifReader);
            if (eVarC.b()) {
                return;
            } else {
                this.f2252a.add(eVarC);
            }
        }
    }
}
