sbt installerZip
cp Installer/target/equella-installer-6.6.zip docker/

cd docker
sudo service docker start
sudo docker build .
sudo docker login -u AWS -p eyJwYXlsb2FkIjoiRWhEck44UVI3emlPbTQwK1hWY3UvQlArVkxlUXBGUExXSndIUFlESXlQZStmQjlmZTREWVBCaDJkQjkva3FXVEdicjE3NyttQzV0U1BRLytiUDQ5amZ4WThkUmc1RnpCQzBqTEhpeW94WmhITVp6UWZkcXVaTjk5MWlkUzk4OEVFbzFMQmI5NjluVUlBU0lhUEdQeDVoUEZPU0lvaTZQL3krcmlURTJEVGtSQ0NnU3VpR1djWHY0dHhMQ0dpWFc0T3BaYXZZbGtxdVpyU0tDQllUTGlOaUhQbDY0cXdFZnc0VjVpV3hFdzd6cURhclQrN25FUTBac242TUhtRjZPU3JVUmlESEVaZGhaV3pHKzI1WmFMV0JHYnVpM2JKUTlvdGJiUEdnN1F0SFJlc0kxTHA3TDd5Rm9LZVlNVnFZc2ord3ltdGlQQUdkWmJBL1dDdGhmZjZrM2l2eU12TFU1YVJtaWVnMi9mQXd1Nlh3bTBHcFVORzJ3RWs3Zkh2eHFLVUJZa2dxbG1UNWhtVGwvSVYxbmNyWVI1U1JUSFhMemFEb05VUkg1Mmc4UVIyWkpzRGVjbzVRaU5pRkhnekNOYnNac25YYmV5cEluS21LR2hOb0VZREdDcWs2V3pvOWYwa21yeXNDYWRPN0pNeTBCOVRYWEZhb0ZGNzVGb1p0TnhUeUpqTk9yOXpmVFNUUXFKOHdLbHhFSCtOOXpVMjFqMlRqdEZuVnR6WnBrekczQTgrWjJPTmNiSHI0Y0k2ZHhST0V2dGV6TFZkQkpzNm4zaXhnL3Yxd0xZdmxSNklzNFV5UXJzVzFQN01SVmxJL3ZpN1o0SkM5bjlqaEovdTduS0ZXS3Q3Qmp1TkpxM2k4MWxYTHJxY1pUbk9lbUx2UU9Dck1mMjI5dENaaHZxTVZCNDJWWUlyLzI4emRzSlNZbk5hczM3aDgrTUZjNjJrNVBvN0p1TGwrREZuVjN1emZoM3l3OHYzckMyTXFJMjB3VTIySkplNkVvUmRsbEJBMFo4TGZiaXh3NkxYdGU0MWJoR2Noa0tCc3JCd3ZEd0lhdnViRXZqMVZqUXpVVVdjVTdrRTFKc2ptUTZ1ZnNnUjZURlZMSTFuQmY2OGpFemttOG80NUJBTW4zUVNkWVhLdVUyZGRqczY5QmFQK05jcGNoNnlwQ2U3V1JOYUpTb1FmL1NYUHpyNmU3VjUzRFZJRjhvWGo4N21MOERNeXpoYU1EU09CVE5yUlFZTVBNczEvaHd1QndRZTJ1M3lWb2lyZzhRR1pSV3JEVktzeS9BNThUTGdFUFZVd1B1Zjd6UExsM01CVko4Vk00RzJrMkRPd2hxUjF0eGZrZk13ZTIzQ0JBaHV1ZVB0dDNZTnBEbU0rRmtjclo2OVdPdU5sZUY1WmgxMlgrZWFwRDZQWXhUeWgvTzM5NW5iVU5hWTVOQzJvQjVqQ1UzUWZiQ1ZvU3dLUHhpcTZIbUZuR1FmZHFMSzBnemNYa21CajVEb3gyT0w3anZlNmhMUHB5bXpYN20wNUZYTVhxL1FaaDJ6K21OMnRRd1ZwdTdkelkxRXhsTWZ5MmdwWGpTbzV1N2dZZFVmWnlnczJJMVhtdGRXSFZKbGxTT3MzejBGODMyRXFFajAxYi9DMEM4OG41a2pUQk0xMzkxay8yTXBmOFlWeXVQZzFFcko2a2diZi96ME5wNittOUFKS2ZySVRUVGtGM1BxUlBucWJIM0o5aUtXWGdXRmlKWUpjcTh4T3FDIiwiZGF0YWtleSI6IkFRRUJBSGo2bGM0WElKdy83bG4wSGMwMERNZWs2R0V4SENiWTRSSXBUTUNJNThJblV3QUFBSDR3ZkFZSktvWklodmNOQVFjR29HOHdiUUlCQURCb0Jna3Foa2lHOXcwQkJ3RXdIZ1lKWUlaSUFXVURCQUV1TUJFRURHcXlMVVJVZE9VR2ZLV2IzQUlCRUlBN3V5UWpYRHRxQzg4bGV5T1hYeGtQL0s0NTFqVkNHeStZS3doMGZ3cDlsL2hzY2p1b21CT01jdGNBaVJUQ2VaVWpSVVZoVHV2a2s2OUQzNzA9IiwidmVyc2lvbiI6IjIiLCJ0eXBlIjoiREFUQV9LRVkiLCJleHBpcmF0aW9uIjoxNTIwMzMxMjg1fQ== https://682639334592.dkr.ecr.us-west-2.amazonaws.com
sudo docker build -t kmt .
sudo docker tag kmt:latest 142328397574.dkr.ecr.us-west-2.amazonaws.com/kmt:latest
sudo docker push 142328397574.dkr.ecr.us-west-2.amazonaws.com/kmt:latest