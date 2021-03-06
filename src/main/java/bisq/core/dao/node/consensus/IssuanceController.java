/*
 * This file is part of Bisq.
 *
 * Bisq is free software: you can redistribute it and/or modify it
 * under the terms of the GNU Affero General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or (at
 * your option) any later version.
 *
 * Bisq is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE. See the GNU Affero General Public
 * License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with Bisq. If not, see <http://www.gnu.org/licenses/>.
 */

package bisq.core.dao.node.consensus;

import javax.inject.Inject;

import lombok.extern.slf4j.Slf4j;

//TODO
@Slf4j
public class IssuanceController {
   /* private static final long MIN_BSQ_ISSUANCE_AMOUNT = 1000;
    private static final long MAX_BSQ_ISSUANCE_AMOUNT = 10_000_000;*/

    @Inject
    public IssuanceController() {
    }

   /* public boolean maybeProcessData(Tx tx) {
        List<TxOutput> outputs = tx.getOutputs();
        if (outputs.size() >= 2) {
            TxOutput bsqTxOutput = outputs.get(0);
            TxOutput btcTxOutput = outputs.get(1);
            final String btcAddress = btcTxOutput.getAddress();
            // TODO find address by block range/cycle
            final Optional<Proposal> compensationRequest = compensationRequestManager.findByAddress(btcAddress);
            if (compensationRequest.isPresent()) {
                final Proposal compensationRequest1 = compensationRequest.get();
                final long bsqAmount = bsqTxOutput.getValue();
                final long requestedBtc = compensationRequest1.getPayload().getRequestedBsq().value;
                long alreadyFundedBtc = 0;
                final int height = btcTxOutput.getBlockHeight();
                Set<TxOutput> issuanceTxs = bsqBlockChain.findSponsoringBtcOutputsWithSameBtcAddress(btcAddress);
                // Sorting rule: the txs are sorted by inter-block dependency and
                // at each recursive iteration we add another sorted list which can be parsed, so we have a reproducible
                // sorting.
                for (TxOutput txOutput : issuanceTxs) {
                    if (txOutput.getBlockHeight() < height ||
                            (txOutput.getBlockHeight() == height &&
                                    txOutput.getId().compareTo(btcTxOutput.getId()) > 0)) {
                        alreadyFundedBtc += txOutput.getValue();
                    }
                }
                final long btcAmount = btcTxOutput.getValue();
                if (periodVerification.isInSponsorPeriod(height) &&
                        bsqBlockChain.existsCompensationRequestBtcAddress(btcAddress) &&
                        votingVerification.isCompensationRequestAccepted(compensationRequest1) &&
                        alreadyFundedBtc + btcAmount <= requestedBtc &&
                        bsqAmount >= MIN_BSQ_ISSUANCE_AMOUNT && bsqAmount <= MAX_BSQ_ISSUANCE_AMOUNT &&
                        votingVerification.isConversionRateValid(height, btcAmount, bsqAmount)) {
                    //btcTxOutput.setTxOutputType(TxOutputType.SPONSORING_BTC_OUTPUT);
                    tx.setTxType(TxType.ISSUANCE);
                    return true;
                }
            }
        }
        return false;
    }*/
}
