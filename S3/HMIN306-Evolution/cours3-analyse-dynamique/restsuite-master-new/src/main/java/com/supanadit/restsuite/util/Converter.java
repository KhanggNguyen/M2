package com.supanadit.restsuite.util;

import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import javax.imageio.ImageIO;
import org.apache.batik.transcoder.TranscoderException;
import org.apache.batik.transcoder.TranscoderInput;
import org.apache.batik.transcoder.TranscoderOutput;
import org.apache.batik.transcoder.image.PNGTranscoder;
import org.apache.batik.transcoder.SVGAbstractTranscoder;
import org.apache.batik.transcoder.TranscoderException;
import org.apache.batik.transcoder.TranscoderInput;
import org.apache.batik.transcoder.TranscoderOutput;
import org.apache.batik.transcoder.image.PNGTranscoder;
public class Converter {
    public static BufferedImage convertSVGToPNG(String url) throws IOException, TranscoderException {
        analyse.AnalyseLog.analyseLog( "convertSVGToPNG", "toByteArray");
        analyse.AnalyseLog.analyseLog( "convertSVGToPNG", "read");
        analyse.AnalyseLog.analyseLog( "convertSVGToPNG", "flush");
        analyse.AnalyseLog.analyseLog( "convertSVGToPNG", "transcode");
        analyse.AnalyseLog.analyseLog( "convertSVGToPNG", "addTranscodingHint");
        analyse.AnalyseLog.analyseLog( "convertSVGToPNG", "addTranscodingHint");
        ByteArrayOutputStream resultByteStream = new ByteArrayOutputStream();
        TranscoderInput transcoderInput = new TranscoderInput(url);
        TranscoderOutput transcoderOutput = new TranscoderOutput(resultByteStream);
        PNGTranscoder pngTranscoder = new PNGTranscoder();
        pngTranscoder.addTranscodingHint(SVGAbstractTranscoder.KEY_HEIGHT, 14.0F);
        pngTranscoder.addTranscodingHint(SVGAbstractTranscoder.KEY_WIDTH, 14.0F);
        pngTranscoder.transcode(transcoderInput, transcoderOutput);
        resultByteStream.flush();
        return ImageIO.read(new ByteArrayInputStream(resultByteStream.toByteArray()));
    }
}