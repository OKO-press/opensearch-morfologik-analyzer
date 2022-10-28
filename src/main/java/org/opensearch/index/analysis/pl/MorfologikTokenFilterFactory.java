/*
 * SPDX-License-Identifier: Apache-2.0
 */
package org.opensearch.index.analysis.pl;

import morfologik.stemming.polish.PolishStemmer;
import org.apache.lucene.analysis.TokenStream;
import org.apache.lucene.analysis.morfologik.MorfologikFilter;
import org.opensearch.common.settings.Settings;
import org.opensearch.env.Environment;
import org.opensearch.index.IndexSettings;
import org.opensearch.index.analysis.AbstractTokenFilterFactory;


public class MorfologikTokenFilterFactory extends AbstractTokenFilterFactory {

    public MorfologikTokenFilterFactory(IndexSettings indexSettings, Environment environment, String name, Settings settings) {
        super(indexSettings, name, settings);
    }

    @Override
    public TokenStream create(TokenStream tokenStream) {
        return new MorfologikFilter(tokenStream, new PolishStemmer().getDictionary());
    }
}
