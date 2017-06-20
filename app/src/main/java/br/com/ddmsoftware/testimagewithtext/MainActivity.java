package br.com.ddmsoftware.testimagewithtext;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ColorDrawable;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import static android.R.attr.bitmap;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;

    int iCount = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = (Button) findViewById(R.id.myButton);
        button.setText("Clica Aqui!");

        imageView = (ImageView)findViewById(R.id.myImageView);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getBaseContext(), "Hello World.", Toast.LENGTH_LONG).show();

                //writeOnDrawable(R.drawable.dog, "TESTES TESTE TESTE");
                //imageView.setImageResource(R.drawable.dog);

                //imageView.setImageDrawable(writeOnDrawable(R.drawable.dog, "TESTES TESTE TESTE"));

                int aColors[] = new int[3];
                switch (iCount) {
                    case 0:
                        aColors[0] = 255;
                        aColors[1] = 255;
                        aColors[2] = 61;
                        imageView.setImageBitmap(drawTextOnBitmap(getApplication().getBaseContext(),R.drawable.confucio,aColors, "A cultura está acima da diferença da condição social."));
                        iCount++;
                        break;
                    case 1:
                        aColors[0] = 0;
                        aColors[1] = 0;
                        aColors[2] = 0;
                        imageView.setImageBitmap(drawTextOnBitmap(getApplication().getBaseContext(),R.drawable.einstein,aColors, "Existe uma coisa que uma longa existência me ensinou: toda a nossa ciência, comparada à realidade, é primitiva e inocente. e, portanto, é o que temos de mais valioso."));
                        iCount++;
                        break;
                    case 2:
                        aColors[0] = 255;
                        aColors[1] = 255;
                        aColors[2] = 255;
                        imageView.setImageBitmap(drawTextOnBitmap(getApplication().getBaseContext(),R.drawable.platao, aColors, "O cansaço físico, mesmo que suportado forçosamente, não prejudica o corpo, enquanto o conhecimento imposto à força não pode permanecer na alma por muito tempo."));
                        iCount = 0;
                        break;
                }

                //    imageView.setImageBitmap(drawTextOnBitmap(getApplication().getBaseContext(),R.drawable.confucio, "A cultura está acima da diferença da condição social."));

            }
        });
    }

    public Bitmap drawTextOnBitmap(Context context, int resId, String text) {

        // prepare canvas c
        Resources resources = context.getResources();
        float scale = resources.getDisplayMetrics().density;
        Bitmap bitmap = BitmapFactory.decodeResource(resources, resId);

        android.graphics.Bitmap.Config bitmapConfig = bitmap.getConfig();
        // set default bitmap config if none
        if (bitmapConfig == null) {
            bitmapConfig = android.graphics.Bitmap.Config.ARGB_8888;
        }
        // resource bitmaps are immutable, so we need to convert it to mutable one
        bitmap = bitmap.copy(bitmapConfig, true);
        Canvas canvas = new Canvas(bitmap);

        // new antialiased Paint
        TextPaint paint = new TextPaint(Paint.ANTI_ALIAS_FLAG);
        // text color - #3D3D3D
        paint.setColor(Color.rgb(61, 61, 61));
        // text size in pixels
        // Original Code --
        //paint.setTextSize((int) (bitmap.getHeight() / 10 * scale));
        paint.setTextSize((int) (bitmap.getHeight() / 50 * scale));
        // text shadow
        paint.setShadowLayer(1f, 0f, 1f, Color.WHITE);

        // set text width to canvas width minus 16dp padding
        int textWidth = canvas.getWidth() - (int) (16 * scale);

        // init StaticLayout for text
        StaticLayout textLayout = new StaticLayout(text, paint, textWidth,
                Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);

        // get height of multiline text
        int textHeight = textLayout.getHeight();

        // get position of text's top left corner
        float x = (bitmap.getWidth() - textWidth) / 2;
        // Original Y position
        //float y = (bitmap.getHeight() - textHeight) / 2;
        float y = (bitmap.getHeight() - textHeight) / 5;

        // draw text to the Canvas center
        canvas.save();
        canvas.translate(x, y);
        textLayout.draw(canvas);
        canvas.restore();

        return bitmap;
    }

    public Bitmap drawTextOnBitmap(Context context, int resId, int pColors[], String text) {

        // prepare canvas
        Resources resources = context.getResources();
        float scale = resources.getDisplayMetrics().density;
        Bitmap bitmap = BitmapFactory.decodeResource(resources, resId);

        android.graphics.Bitmap.Config bitmapConfig = bitmap.getConfig();
        // set default bitmap config if none
        if (bitmapConfig == null) {
            bitmapConfig = android.graphics.Bitmap.Config.ARGB_8888;
        }
        // resource bitmaps are immutable, so we need to convert it to mutable one
        bitmap = bitmap.copy(bitmapConfig, true);
        Canvas canvas = new Canvas(bitmap);

        // new antialiased Paint
        TextPaint paint = new TextPaint(Paint.ANTI_ALIAS_FLAG);

        // text color - #3D3D3D
        // Original Color
        //paint.setColor(Color.rgb(61, 61, 61));
        paint.setColor(Color.rgb(pColors[0], pColors[1], pColors[2]));
        //paint.setColor(pColors[0]);
        // text size in pixels
        // Original Code --
        //paint.setTextSize((int) (bitmap.getHeight() / 10 * scale));
        //paint.setTextSize((int) (bitmap.getHeight() / 50 * scale));

        int myTextSize = (int) (bitmap.getHeight() / 80 * scale);
        paint.setTextSize(myTextSize);

        Toast.makeText(getBaseContext(), "OLHA O TAMANHO DO MEU TEXTO: " + myTextSize, Toast.LENGTH_LONG).show();
        // text shadow
        //paint.setShadowLayer(1f, 0f, 1f, Color.WHITE);

        // set text width to canvas width minus 16dp padding
        int textWidth = canvas.getWidth() - (int) (16 * scale);

        // init StaticLayout for text
        /*StaticLayout textLayout = new StaticLayout(text, paint, textWidth,
                Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);
        */
        StaticLayout textLayout = new StaticLayout(text, paint, textWidth,
                Layout.Alignment.ALIGN_CENTER, 1.0f, 0.0f, false);

        // get height of multiline text
        int textHeight = textLayout.getHeight();

        // get position of text's top left corner
        float x = (bitmap.getWidth() - textWidth) / 2;
        // Original Y position
        //float y = (bitmap.getHeight() - textHeight) / 2;
        float y = (bitmap.getHeight() - textHeight) / 5;

        // draw text to the Canvas center
        canvas.save();
        canvas.translate(x, y);
        textLayout.draw(canvas);
        canvas.restore();

        return bitmap;
    }


    public BitmapDrawable writeOnDrawable(int pDrawableId, String pText) {

        Bitmap bm = BitmapFactory.decodeResource(getResources(), pDrawableId).copy(Bitmap.Config.ARGB_8888, true);

        Paint paint = new Paint();
        paint.setStyle(Paint.Style.FILL);
        paint.setColor(Color.BLACK);
        paint.setTextSize(20);

        Canvas canvas = new Canvas(bm);
        canvas.drawText(pText, 0, bm.getHeight()/2, paint);

        return new BitmapDrawable(bm);

/*
        BitmapDrawable (Resources res, Bitmap bitmap){
            return new BitmapDrawable(getBaseContext().getResources(), bm);

        } */
    }

}
